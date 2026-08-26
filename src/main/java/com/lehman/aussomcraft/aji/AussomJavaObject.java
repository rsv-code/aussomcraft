/*
 * Copyright 2026 Austin Lehman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Ported from the aussom reference implementation. The only functional
 * change is that class names resolve through AjiGate.getClassLoader()
 * rather than ClassLoader.getSystemClassLoader(); inside a Paper plugin the
 * system loader cannot see org.bukkit at all. See
 * design/aussomcraft-design-1.md section 3.
 */

package com.lehman.aussomcraft.aji;

import com.aussom.Environment;
import com.aussom.ast.astClass;
import com.aussom.ast.aussomException;
import com.aussom.stdlib.ABuffer;
import com.aussom.types.*;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AussomJavaObject {
    private String name = "";
    private Object obj = null;

    public AussomJavaObject() { }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public AussomType getName(Environment env, ArrayList<AussomType> args) {
        return new AussomString(this.name);
    }

    /**
     * The wrapped object's actual class name, which is what the sandbox
     * judges an invocation against.
     *
     * Deliberately not getName(): that holds the name the object
     * was created under, and a method can hand back an instance of some
     * other class entirely. Policy has to apply to what the receiver really
     * is, or a permitted call could return a denied type that is then
     * freely callable.
     *
     * @return the runtime class, or null when nothing is wrapped.
     */
    private Class<?> receiverClass() {
        if (this.obj == null) {
            return null;
        }
        return this.obj.getClass();
    }

    public AussomType invoke(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaMethodName = (((AussomString)args.get(0)).str());
        AussomList aargs = (AussomList) args.get(1);
        List<AussomType> methArgs = aargs.getValue();

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.invoke", "aji.invoke()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, receiverClass(), "aji.invoke()"); }
        if (denied != null) { return denied; }

        return this.invoke(this.obj, env, javaMethodName, methArgs, false);
    }

    public AussomType invokeRaw(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaMethodName = (((AussomString)args.get(0)).str());
        AussomList aargs = (AussomList) args.get(1);
        List<AussomType> methArgs = aargs.getValue();

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.invoke", "aji.invokeRaw()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, receiverClass(), "aji.invokeRaw()"); }
        if (denied != null) { return denied; }

        return this.invoke(this.obj, env, javaMethodName, methArgs, true);
    }

    public AussomType getMember(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaMemberName = (((AussomString) args.get(0)).str());

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.getmember", "aji.getMember()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, receiverClass(), "aji.getMember()"); }
        if (denied != null) { return denied; }

        try {
            Field field = this.obj.getClass().getDeclaredField(javaMemberName);
            field.setAccessible(true);
            Object robj = field.get(this.obj);
            return this.mapResultObject(env, robj);
        } catch (NoSuchFieldException e) {
            throw new aussomException("aji.getMember(): Java class '" + this.obj.getClass().getName() + "' field '" + javaMemberName + "' not found.");
        } catch (IllegalAccessException e) {
            throw new aussomException("aji.getMember(): Java class '" + this.obj.getClass().getName() + "' field '" + javaMemberName + "' illegal access exception.");
        }
    }

    public AussomType setMember(Environment env, ArrayList<AussomType> args) throws aussomException {
        String javaMemberName = (((AussomString) args.get(0)).str());
        AussomType aval = (AussomType)args.get(1);

        AussomType denied = null;
        if (denied == null) { denied = AjiGate.checkFlag(env, "aussom.aji.setmember", "aji.setMember()"); }
        if (denied == null) { denied = AjiGate.checkClass(env, receiverClass(), "aji.setMember()"); }
        if (denied != null) { return denied; }

        try {
            Field field = this.obj.getClass().getDeclaredField(javaMemberName);
            field.setAccessible(true);
            Object jobj = this.getClassAussomTypeValue(aval);
            if (jobj != null || !(aval instanceof AussomNull)) {
                field.set(this.obj, jobj);
            } else {
                // Attempt to coerce.
                CoercedValue cv = new CoercedValue();
                this.attemptCoercion(field.getType(), aval, cv);
                if (cv.val != null) {
                    field.set(this.obj, cv.val);
                } else {
                    throw new aussomException("aji.getMember(): Java class '" + this.obj.getClass().getName() + "' field '" + javaMemberName + "' can't find suitable conversion from Aussom type '" + aval.getType().name() + "' to Java type '" + field.getType().getName() + "'.");
                }
            }
        } catch (NoSuchFieldException e) {
            throw new aussomException("aji.getMember(): Java class '" + this.obj.getClass().getName() + "' field '" + javaMemberName + "' not found.");
        } catch (IllegalAccessException e) {
            throw new aussomException("aji.getMember(): Java class '" + this.obj.getClass().getName() + "' field '" + javaMemberName + "' illegal access exception.");
        }
        return env.getClassInstance();
    }

    public class MethodMatch {
        public Method method;
        public List<Object> args = new ArrayList<>();
    }

    public class CoercedValue {
        public Object val = new Object();
    }

    private AussomType invoke(Object cobj, Environment env, String javaMethodName, List<AussomType> methArgs, boolean raw) throws aussomException {
        MethodMatch mm = this.getMatch(cobj, cobj.getClass(), javaMethodName, methArgs);

        if (mm.method != null) {
            // Match found, attempt to invoke.
            try {
                // This is required for certain situations where
                // the inner class is not accessible.
                mm.method.setAccessible(true);
                Object retObj = mm.method.invoke(cobj, mm.args.toArray());

                // It is alread an aussom type, no wrapping needed.
                if (retObj instanceof AussomType)
                    return (AussomType) retObj;

                // Not an Aussom type, either convert or wrap.
                if (raw) {
                    return this.wrapRawObject(env, retObj);
                } else {
                    return this.mapResultObject(env, retObj);
                }
            } catch (Exception e) {
                return new AussomException("AussomJavaObject.invoke(): In Java class '" + cobj.getClass().getName() + "' method invoke exception: " + causeMessage(e));
            }
        } else {
            throw new aussomException("AussomJavaObject.newObj(): In Java class '" + cobj.getClass().getName() + "' could not find a matching method '" + javaMethodName + "' for the provided arguments.");
        }
    }

    /**
     * Returns a useful message for an exception thrown while reflectively
     * invoking a method or constructor. Method.invoke and
     * Constructor.newInstance wrap the real failure in an
     * InvocationTargetException whose own getMessage() is null, so the
     * message must be taken from the cause. Falls back to the class name
     * when the cause carries no message. Shared with AussomAJI.
     */
    public static String causeMessage(Throwable e) {
        Throwable t = e;
        if (e instanceof InvocationTargetException && e.getCause() != null) {
            t = e.getCause();
        }
        if (t.getMessage() != null) {
            return t.getMessage();
        }
        return t.getClass().getName();
    }

    protected MethodMatch getMatch(Object cobj, Class<?> clazz, String javaMethodName, List<AussomType> methArgs) {
        MethodMatch mm = this.getExactMatch(cobj, clazz, javaMethodName, methArgs);
        if (mm.method != null) return mm;
        else {
            Method methods[] = new Method[0];
            if (cobj != null)
                methods = cobj.getClass().getMethods();
            else
                methods = clazz.getMethods();
            mm = this.findFromList(javaMethodName, methods, methArgs);
            if (mm.method != null) return mm;
        }
        return new MethodMatch();
    }

    protected MethodMatch getExactMatch(Object cobj, Class<?> clazz, String javaMethodName, List<AussomType> methArgs) {
        MethodMatch mm = new MethodMatch();
        Class<?> typeArgs[] = new Class<?>[methArgs.size()];

        for (int i = 0; i < methArgs.size(); i++) {
            AussomType at = methArgs.get(i);
            typeArgs[i] = this.getClassType(at);
            mm.args.add(this.getClassAussomTypeValue(at));
        }

        try {
            if (cobj != null)
                mm.method = cobj.getClass().getMethod(javaMethodName, typeArgs);
            else
                mm.method = clazz.getMethod(javaMethodName, typeArgs);
        } catch (NoSuchMethodException e) {
            // Do nothing, we expect this
        }

        return mm;
    }

    protected MethodMatch findFromList(String javaMethodName, Method methods[], List<AussomType> methArgs) {
        MethodMatch match = new MethodMatch();

        boolean found = true;
        for (Method method : methods) {
            if (method.getName().equals(javaMethodName)) {
                found = true;
                if (method.getParameterCount() == methArgs.size()) {
                    // This may be the one!
                    if (methArgs.size() == 0) {
                        match.method = method;
                        break;
                    } else {
                        // Check the args, if they can be coerced.
                        List<Object> targs = new ArrayList<>();
                        int num = 0;
                        for (Parameter param : method.getParameters()) {
                            AussomType arg = methArgs.get(num);

                            Class<?> tmpType = this.getClassType(arg);
                            if (tmpType != null && (tmpType == param.getType()
                                    || param.getType().isAssignableFrom(tmpType)
                                    || param.getType() == Object.class)) {
                                // Look for the direct convert
                                targs.add(this.getClassAussomTypeValue(arg));
                            } else {
                                // No direct conversion, attempt first level coercion.
                                CoercedValue tobj = new CoercedValue();
                                if (!this.attemptCoercion(param.getType(), arg, tobj)) {
                                    found = false;
                                    break;
                                }
                                targs.add(tobj.val);
                            }
                            num++;
                        }
                        if (found) {
                            // Hurray, we made it here!
                            match.method = method;
                            match.args = targs;
                            break;
                        }
                    }
                }
            }
        }

        return match;
    }

    protected boolean attemptCoercion(Class<?> paramType, AussomType arg, CoercedValue tobj) {
        boolean ret = false;
        if (arg instanceof AussomNull) {
            tobj.val = null;
            ret = true;
        } else if (paramType == int.class && arg instanceof AussomInt) {
            tobj.val = (int)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == Integer.class && arg instanceof AussomInt) {
            tobj.val = (Integer)(int)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == short.class && arg instanceof AussomInt) {
            tobj.val = (short)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == Short.class && arg instanceof AussomInt) {
            tobj.val = (Short)(short)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == byte.class && arg instanceof AussomInt) {
            tobj.val = (byte)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == Byte.class && arg instanceof AussomInt) {
            tobj.val = (Byte)(byte)((AussomInt)arg).getValue();
            ret = true;
        } else if (paramType == float.class && arg instanceof AussomDouble) {
            tobj.val = (float)((AussomDouble)arg).getValue();
            ret = true;
        } else if (paramType == Float.class && arg instanceof AussomDouble) {
            tobj.val = (Float)(float)((AussomDouble)arg).getValue();
            ret = true;
        } else if (paramType == double.class && arg instanceof AussomDouble) {
            tobj.val = (double)((AussomDouble)arg).getValue();
            ret = true;
        } else if (paramType == Double.class && arg instanceof AussomDouble) {
            tobj.val = (Double)((AussomDouble)arg).getValue();
            ret = true;
        } else if (paramType == boolean.class && arg instanceof AussomBool) {
            tobj.val = (boolean)((AussomBool)arg).getValue();
            ret = true;
        } else if (paramType == Boolean.class && arg instanceof AussomBool) {
            tobj.val = (Boolean)((AussomBool)arg).getValue();
            ret = true;
        } else if (paramType == char.class && arg instanceof AussomString) {
            String str = ((AussomString)arg).getValue();
            if (str.length() > 0)
                tobj.val = str.charAt(0);
            else
                tobj.val = (char)0;
            ret = true;
        } else if (paramType == char[].class && arg instanceof AussomString) {
            tobj.val = ((AussomString)arg).getValue().toCharArray();
            ret = true;
        } else if (
            arg instanceof AussomObject
            && ((AussomObject) arg).getExternObject() instanceof AussomJavaObject
            && paramType.isInstance(((AussomJavaObject)((AussomObject)arg).getExternObject()).getObj())
        ) {
            AussomObject ao = (AussomObject)arg;
            AussomJavaObject ajo = (AussomJavaObject)ao.getExternObject();
            tobj.val = ajo.getObj();
            ret = true;
        }
        return ret;
    }

    protected Class<?> getClassType(AussomType at) {
        if (at instanceof AussomNull)
            return null;
        else if (at instanceof AussomString)
            return String.class;
        else if (at instanceof AussomBool)
            return boolean.class;
        else if (at instanceof AussomInt)
            return long.class;
        else if (at instanceof AussomDouble)
            return double.class;
        else if (at instanceof AussomList)
            return List.class;
        else if (at instanceof AussomMap)
            return Map.class;
        else if (at instanceof AussomObject) {
            AussomObject ao = (AussomObject) at;
            if (ao.getExternObject() != null) {
                if (ao.getExternObject() instanceof AussomJavaObject) {
                    AussomJavaObject ajo = (AussomJavaObject) ao.getExternObject();
                    return ajo.getObj().getClass();
                } else if (ao.getExternObject() instanceof ABuffer) {
                    return byte[].class;
                } else {
                    return ao.getExternObject().getClass();
                }
            } else {
                // Probably not what is expected to be passed in here.
                return at.getClass();
            }
        } else {
            return null;
        }
    }

    protected Object getClassAussomTypeValue(AussomType at) {
        if (at instanceof AussomNull)
            return null;
        else if (at instanceof AussomString)
            return ((AussomString)at).getValue();
        else if (at instanceof AussomBool)
            return ((AussomBool)at).getValue();
        else if (at instanceof AussomInt)
            return ((AussomInt)at).getValue();
        else if (at instanceof AussomDouble)
            return ((AussomDouble)at).getValue();
        else if (at instanceof AussomList)
            return this.getClassAussomTypeValueList((AussomList)at);
        else if (at instanceof AussomMap)
            return this.getClassAussomTypeValueMap((AussomMap)at);
        else if (at instanceof AussomObject) {
            AussomObject ao = (AussomObject) at;
            if (ao.getExternObject() != null) {
                if (ao.getExternObject() instanceof AussomJavaObject) {
                    AussomJavaObject ajo = (AussomJavaObject) ao.getExternObject();
                    return ajo.getObj();
                } else if (ao.getExternObject() instanceof ABuffer) {
                    ABuffer ab = (ABuffer) ao.getExternObject();
                    return ab.getBuffer();
                } else {
                    return ao.getExternObject();
                }
            } else {
                // Probably not what is expected to be passed in here.
                return at;
            }
        } else {
            return null;
        }
    }

    protected Object getClassAussomTypeValueList(AussomList alist) {
        List<Object> lst = new ArrayList<>();
        for (AussomType at : alist.getValue()) {
            lst.add(this.getClassAussomTypeValue(at));
        }
        return lst;
    }

    protected Object getClassAussomTypeValueMap(AussomMap amap) {
        Map<String, Object> mp = new HashMap<>();
        for (String key : amap.getValue().keySet()) {
            mp.put(key, this.getClassAussomTypeValue(amap.getValue().get(key)));
        }
        return mp;
    }

    protected AussomType mapResultObject(Environment env, Object obj) throws aussomException {
        if (obj == null) {
            return new AussomNull();
        } else if (obj instanceof AussomType) {
            return (AussomType) obj;
        } else if (obj instanceof String) {
            return new AussomString((String)obj);
        } else if (obj instanceof Character) {
            return new AussomString(String.valueOf((char)obj));
        } else if (obj instanceof Boolean) {
            return new AussomBool((Boolean)obj);
        } else if (obj instanceof Byte) {
            return new AussomInt((Byte)obj);
        } else if (obj instanceof Short) {
            return new AussomInt((Short)obj);
        } else if (obj instanceof Integer) {
            return new AussomInt((Integer)obj);
        } else if (obj instanceof Long) {
            return new AussomInt((Long)obj);
        } else if (obj instanceof Double) {
            return new AussomDouble((Double)obj);
        } else if (obj instanceof Float) {
            return new AussomDouble((Float)obj);
        } else if (obj instanceof List) {
            return this.mapResultObjectList(env, (List)obj);
        } else if (obj instanceof Map) {
            return this.mapResultObjectMap(env, (Map)obj);
        } else if (obj instanceof byte[]) {
            astClass ac = env.getClassByName("Buffer");
            AussomObject ret = (AussomObject) ac.instantiate(env, false, new AussomList());
            ABuffer ab = (ABuffer) ret.getExternObject();
            ab.setBuffer((byte[])obj);
            return ret;
        } else if (obj instanceof char[]) {
            return new AussomString(new String((char[])obj));
        } else {
            AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");
            AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
            ajo.setName(obj.getClass().getCanonicalName());
            ajo.setObj(obj);
            return ret;
        }
    }

    protected AussomType mapResultObjectList(Environment env, List<Object> obj) throws aussomException {
        AussomList al = new AussomList();
        for (Object item : obj) {
            al.getValue().add(this.mapResultObject(env, item));
        }
        return al;
    }

    protected AussomType mapResultObjectMap(Environment env, Map<Object, Object> obj) throws aussomException {
        AussomMap am = new AussomMap();
        for (Object key : obj.keySet()) {
            String keyStr = key.toString();
            am.getValue().put(keyStr, this.mapResultObject(env, obj.get(key)));
        }
        return am;
    }

    public AussomType toString(Environment env, ArrayList<AussomType> args) {
        if (this.obj == null) return new AussomString("AussomJavaObject[null]");
        return new AussomString("AussomJavaObject[" + this.obj.getClass().getName() + "]");
    }

    protected AussomType wrapRawObject(Environment env, Object obj) throws aussomException {
        if (obj == null) {
            return new AussomNull();
        }
        AussomObject ret = env.getEngine().instantiateObject("AussomJavaObject");
        AussomJavaObject ajo = (AussomJavaObject) ret.getExternObject();
        ajo.setName(obj.getClass().getCanonicalName());
        ajo.setObj(obj);
        return ret;
    }
}
