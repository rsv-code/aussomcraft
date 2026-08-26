# AussomCraft Testing

How to test this plugin, and what each kind of test can and cannot tell you.

The manual pass in section 5 runs against the scripts in `examples/`, so it
doubles as a walk through what those scripts do. Copy them to the server as
described in 4.6 and work down the table.

---

## 1. Three layers

| Layer | Needs | Covers | Runs |
| --- | --- | --- | --- |
| 1. JUnit | nothing | profiles, the AJI gate, the trust store, the generated surface and the untrusted allowlist, example scripts parse | every build |
| 2. MockBukkit | a test dependency | event registration and firing, commands and whether they survive a reload, scheduler, store, load and unload, the tier a script ends up at | every build |
| 3. Paper server | a real server, a client | the class loader, setAccessible, per-tick cost, the demo | before a release |

Layers 1 and 2 are `mvn test`. Layer 3 is a server you start by hand.

---

## 2. Components

```
  aussomcraft/
    src/main/java ......... the plugin
    src/test/java ......... layers 1 and 2          mvn test
    examples/*.aus ........ the scripts under test
    target/AussomCraft-0.1.0.jar
         |
         | copy
         v
    testserver/                                     layer 3
      paper.jar ........... Paper 26.2, needs JDK 25
      eula.txt
      plugins/
        AussomCraft-0.1.0.jar
        AussomCraft/
          scripts/*.aus ... copied from examples/
          trust.yml ....... grants, written by /acraft trust
          store.yml ....... per-script store
          config.yml ...... watchdog budget
         ^
         | localhost:25565
         |
    Minecraft Java Edition client
```

Everything for layer 3 lives in `testserver/`, which is gitignored.

---

## 3. Why layer 3 exists

Paper does not put the Bukkit API on the system class loader:

```
  serverLoader (patched server + libraries) -> platform -> boot
       ^
       | parent
  PluginClassLoader (AussomCraft.jar)

  appLoader (paperclip only) .............. a sibling, not an ancestor
```

AJI resolves class names through the loader the plugin hands it. If that is
wrong, every Bukkit lookup fails.

**Layers 1 and 2 cannot catch this.** Both run on the ordinary app class
loader, where `getSystemClassLoader()` *can* see `org.bukkit`. Broken loader
wiring passes every JUnit and MockBukkit test and fails on a real server. So
never write a class loader assertion in layers 1 or 2, and never read a green
suite as covering it.

---

## 4. Setup

You need JDK 25 (`JAVA_HOME` must point at it) and the Minecraft Java Edition
client.

### 4.1 Build the plugin

```bash
cd ~/git/github/aussomcraft
mvn clean package
```

### 4.2 Get the Paper server

```bash
mkdir -p testserver && cd testserver
URL=$(curl -s https://fill.papermc.io/v3/projects/paper/versions/26.2/builds/latest \
      | python3 -c "import json,sys; print(json.load(sys.stdin)['downloads']['server:default']['url'])")
curl -L -o paper.jar "$URL"
```

### 4.3 Accept the EULA

```bash
java -jar paper.jar --nogui          # exits and writes eula.txt
```

Read `eula.txt`, and if you agree to Mojang's terms set `eula=true` in it.

### 4.4 Generate the world

```bash
java -Xms2G -Xmx2G -jar paper.jar --nogui
```

Wait for `Done (...)`, then type `stop`.

### 4.5 Let the client connect without auth

In `testserver/server.properties`:

```
online-mode=false
```

Local testing only. Never on a public server.

### 4.6 Install the plugin and the scripts

```bash
cd ~/git/github/aussomcraft
cp target/AussomCraft-0.1.0.jar testserver/plugins/
mkdir -p testserver/plugins/AussomCraft/scripts
cp examples/*.aus testserver/plugins/AussomCraft/scripts/
```

### 4.7 Start it

```bash
cd testserver && java -Xms2G -Xmx2G -jar paper.jar --nogui
```

Console commands take no leading slash: type `acraft list`, not `/acraft list`.

### 4.8 Connect

In the Minecraft launcher pick a **26.2** profile, then Multiplayer, Direct
Connection, `localhost`. The client version must match the server's, which is
26.2 here. Do not go by the `api-version: '1.21'` in `plugin.yml`, which is
the Bukkit API level and is a different number.

Give yourself operator from the server console:

```
op <yourname>
```

---

## 5. The checks

Run in order. Console unless the row says in game.

| # | Do | Expect |
| --- | --- | --- |
| 1 | start the server | each script logs `loaded untrusted (sha256 ...)` |
| 2 | `acraft list` | every script listed, all untrusted |
| 3 | join the server | `01-join-leave.aus` broadcasts your name |
| 4 | in game `/where` | your world and coordinates |
| 5 | `acraft load demo-op.aus --as untrusted` | refused, and the log says why |
| 6 | `acraft trust 06-trusted-worldinfo.aus dangerous` | reports it is now dangerous |
| 7 | in game `/worldinfo` | world name, time and player counts |
| 8 | `acraft load demo-op.aus --as dangerous`, then rejoin | it greets you, and `attacker` is quietly opped |
| 9 | edit a granted script, `acraft reload` | it drops back to untrusted |
| 10 | `acraft reload`, then in game `/where` again | still answers, from `02-command.aus` |
| 11 | in game `/joins`, then disconnect and rejoin | `05-counter.aus` greets you with one visit more than `/joins` reported |
| 12 | `acraft reload`, rejoin, `/joins` | the count kept going up across the reload |
| 13 | `stop` the server, start it, rejoin, `/joins` | the count survived the restart |
| 14 | in game `/nick`, then `/nick Sir Robin`, then `/nick` | `07-nickname.aus` answers with no argument, keeps both words, then reads it back |
| 15 | copy a new `.aus` into `scripts/` while the server runs, `acraft list` | it is not there; then `acraft load <file>` picks it up |
| 16 | `acraft unload 03-announcer.aus` then wait | the announcer stops |
| 17 | in creative, place and break a diamond ore | `04-block-break.aus` messages you |
| 18 | leave the server | `01-join-leave.aus` announces it |

**Check 7 is the one that matters.** It is the only step that drives AJI into
a live `CraftWorld`, so it exercises the class loader, `setAccessible` on real
Paper types, and the AJI call path together. A wrong loader shows up as
`ClassNotFoundException ... Is the .jar file in the classpath?`

Check 5 against check 8 is the demo: same file, same server, tier as the only
variable. Both need a join to fire, because the handler is on
`PlayerJoinEvent`; loading the script is not enough on its own. Undo check 8
afterwards with `deop attacker`.

Check 8 also leaves `demo-op.aus` running at the dangerous tier until the
next reload. `--as` writes no grant, so `acraft reload` puts it back to
untrusted, where it refuses to load at all.

**Check 10 is worth doing every time.** A script's command used to stop
answering after a reload: the old registration kept the name, so the
reloaded script was pushed to `/script:name` and the bare name pointed at a
command nobody owned. Nothing in the log said so. It is fixed and covered in
layer 2, but it failed silently for a long time, and silence is what makes it
worth a manual look.

Checks 11 to 13 are the store. The count in `05-counter.aus` goes up when a
player joins, not when `/joins` is run, so each of these needs a rejoin to
move it. 12 shows the store surviving a reload and 13 shows it surviving a
restart, which is the only way to see `store.yml` actually written and read
back.

Check 14 is the argument path, which nothing else here touches. The bare
`/nick` is the case worth watching: reading `Args[0]` without first checking
`#Args` throws, and the throw is caught and logged against the script, so
from in game the command simply does nothing.

Check 15 is worth knowing before you go looking for a bug. Nothing watches
the scripts directory and nothing rescans it on a timer, so a file copied in
while the server runs stays inert until it is named. `acraft load <file>`
takes a file that was never loaded, which beats reloading every script to
pick up one.

Checks 3, 4, 10, 11, 14, 17 and 18 exercise the generated API, since those
handlers reach the player and the block through their shims rather than
through AJI.

## 6. Measuring per-tick cost

Still unmeasured. There are two call paths and they cost different things,
so measure them separately.

**The generated path**, which is what untrusted and trusted scripts use. A
shim method casts the receiver once and calls Paper directly, so nothing
searches a method list. Use `04-block-break.aus`, hold a pickaxe in a quarry,
and watch `tps`, plus `spark profiler` if it is installed.

**The AJI path**, which only the dangerous tier can reach.
`AussomJavaObject.getMatch` calls `getMethods()` and walks the result on
every single call, so this is the one to expect trouble from. Measuring it
needs a dangerous script doing AJI work in a hot handler; `04-block-break.aus`
will not show it, because an untrusted script never goes near AJI. If it
costs, the fix is a per (class, name, arity) method cache in
`AussomJavaObject`.

---

## 7. What each layer cannot tell you

- **Layer 1** never touches Bukkit, so it says nothing about registration,
  scheduling or command routing.
- **Layer 2** runs a fake server in-process. It says nothing about the class
  loader, `setAccessible`, or timing. Types backed by a registry, such as
  `ItemStack`, cannot be built without a server at all, so they can only be
  reached here and not in layer 1.
- **Layer 3** is manual and unrepeatable. It is where the real answers are,
  and it is not a substitute for the first two.
