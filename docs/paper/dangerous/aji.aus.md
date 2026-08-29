# file: aji.aus

## class: aji

[25:21] `static` (extern: com.lehman.aussomcraft.aji.AussomAJI) **extends: object** 

Aussom AJI (Aussom Java Interface) is an interface used to directly
create, modify, and invoke Java objects directly. No Java code or
compilation step needed. This allows you to call static Java methods,
or to create new Java objects and pass them around.
This static class (aji) provides functions for creating and calling
java objects.

#### Methods

- **invokeStatic** (`string JavaObjName, string MethodName, ...`)

	> Invokes the static method of the provided Java object with the provided optional arguments.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `MethodName` is a string with the Java method to invoke.
	- **@p** `etc` is a list of optional arguemnts to pass to the Java function.
	- **@r** `A` return object with the result. If a simple type is returned such as a string or int, it will be automatically converted to a simple Aussom type. If it returns an object it will be wrapped in a AussomJavaObject.


- **invokeStaticRaw** (`string JavaObjName, string MethodName, ...`)

	> This is the same as normal invoke static function, but instead of mapping the return object to the best fit object it simply wraps the result Java object in a AussomJavaObject. This function can be handy when you need to get a collection to add to where you don't want it converted to an Aussom list.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `MethodName` is a string with the Java method to invoke.
	- **@p** `etc` is a list of optional arguemnts to pass to the Java function.
	- **@r** `A` return object with the result in a AussomJavaObject.


- **getStaticMember** (`string JavaObjName, string MemberName`)

	> Gets the value of a static field in the provided Java class name.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `MemberName` is a string with the member name.
	- **@r** `A` return object with the result. If a simple type is returned such as a string or int, it will be automatically converted to a simple Aussom type. If it returns an object it will be wrapped in a AussomJavaObject.


- **setStaticMember** (`string JavaObjName, string MemberName, Value`)

	> Sets the provided static member with the provided value.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `MemberName` is a string with the member name.
	- **@p** `Value` is any value to set.
	- **@r** `this` obejct


- **newObj** (`string JavaObjName, ...`)

	> Creates a new Java object with the provided Java object name. In this case, you will need to provide the full package path with class name. (ie java.lang.String) Throws an excpetion on failure.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `...` is an optional list of arguments for the constructor.
	- **@r** `An` AussomJavaObject with the Java object that was created.


- **bufferToInputStream** (`object Buff`)

	> Converts the provided Buffer to an InputStream object. The InputStream will be wrapped in a AussomJavaObject.

	- **@p** `Buff` is a Buffer object to convert.
	- **@r** `A` AussomJavaObject object with the InputStream.


- **inputStreamToBuffer** (`object InputStream`)

	> Converts the provided InputStream object to a Buffer object.

	- **@p** `InputStream` is a AussomJavaObject object with an InputStream to convert.
	- **@r** `A` Buffer object.


- **listToJavaArray** (`string JavaClassName, list Items`)

	> Converts an Aussom list to a Java array of the specified type. This handles the conversion from Aussom types to Java types automatically, including primitive arrays. For primitive types use the short name: "double", "int", "long", "float", "boolean", "byte", "short". For object types use the full class name: "java.lang.String", "javafx.scene.paint.Stop", etc.

	- **@p** `JavaClassName` is a string with the Java type name.
	- **@p** `Items` is a list of values to convert.
	- **@r** `An` AussomJavaObject wrapping the Java array.


- **listToJavaArrayList** (`list Items`)

	> Converts an Aussom list to a Java ArrayList. Each element is converted from its Aussom type to the corresponding Java type automatically.

	- **@p** `Items` is a list of values to convert.
	- **@r** `An` AussomJavaObject wrapping the Java ArrayList.


- **closure** (`string JavaObjName, callback ToCall`)

	> Dynamically creates a Java closure object that will work with any closure interface. It takes the closure interface Java class name along with the Aussom callback to call when invoked. Like invoke this will attempt to convert Java types to Aussom types. If they can't be converted to native types they will be wrapped in AussomJavaObject objects. The arguments will be sent as arguments to the provided Aussom callback.

	- **@p** `JavaObjName` is a string with the full Java package and class name.
	- **@p** `ToCall` is a callback to call when invoked.
	- **@r** `A` AussomJavaObject with the closure. This can be then provided as the argument to the function expecting the closure.




## class: AussomJavaObject

[155:14] (extern: com.lehman.aussomcraft.aji.AussomJavaObject) **extends: object** 

#### Methods

- **getName** ()

	> Returns the Java class name with package.

	- **@r** `A` string with the Java class name with package.


- **invoke** (`string MethodName, ...`)

	> Invokes the provided Java method with the provided arguments.

	- **@p** `MethodName` is a string with the Java method to invoke.
	- **@p** `etc` is a list of optional arguemnts to pass to the Java function.
	- **@r** `A` return object with the result. If a simple type is returned such as a string or int, it will be automatically converted to a simple Aussom type. If it returns an object it will be wrapped in a AussomJavaObject.


- **invokeRaw** (`string MethodName, ...`)

	> This is the same as normal invoke function, but instead of mapping the return object to the best fit object it simply wraps the result Java object in a AussomJavaObject. This function can be handy when you need to get a collection to add to where you don't want it converted to an Aussom list.

	- **@p** `MethodName` is a string with the Java method to invoke.
	- **@p** `etc` is a list of optional arguemnts to pass to the Java function.
	- **@r** `A` return object with the result in a AussomJavaObject.


- **getMember** (`string MemberName`)

	> Gets the value of a member field in the Java object.

	- **@p** `MemberName` is a string with the member name.
	- **@r** `A` return object with the result. If a simple type is returned such as a string or int, it will be automatically converted to a simple Aussom type. If it returns an object it will be wrapped in a AussomJavaObject.


- **setMember** (`string MemberName, Value`)

	> Sets the provided member with the provided value.

	- **@p** `MemberName` is a string with the member name.
	- **@p** `Value` is any value to set.
	- **@r** `this` obejct


- **toString** ()

	> Prints a little bit of infomration about this object.

	- **@r** `A` string with infomration about the object.




