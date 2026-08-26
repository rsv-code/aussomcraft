# AussomCraft

![Aussomcraft Img](branding/aussomcraft-logo.png)

_by Austin Lehman_

Write Paper server logic in the [Aussom](https://aussom-lang.com) scripting
language. No build step, no restart, and scripts you did not write cannot
reach the filesystem, the network, or the server itself, and cannot read the
commands anyone types.

Apache 2.0. See [License](#license).

## Requirements

- Paper 26.2
- Java 25, which Paper 26.2 requires

## Guide

New to this? Start with the [guide](docs/guide/), written for people who have
not written code before. Read in order.

1. [What AussomCraft is](docs/guide/01-overview.md) - what you can make, how
   the safety levels work, and what you need.
2. [Getting started](docs/guide/02-getting-started.md) - install it, write
   your first script, and react to things happening in the game.
3. [Intermediate](docs/guide/03-intermediate.md) - your own commands, timers,
   saving data, and getting a script approved.
4. [Advanced](docs/guide/04-advanced.md) - the dangerous tier, keeping
   scripts fast, and handling scripts other people wrote.

Working on the plugin rather than writing scripts?
[How AussomCraft works](docs/guide/05-java-developers.md) covers the Java
side: the classes involved and how they fit together.

## Getting started

Scripts live in `plugins/AussomCraft/scripts/` and end in `.aus`. Copy one of
the `examples/` in and run `/acraft reload`.

```
class Main {
    public main() {
        events.on("PlayerJoinEvent", ::onJoin);
        return 0;
    }

    public onJoin(Evt) {
        server.broadcast(Evt.getPlayer().getName() + " joined.");
    }
}
```

The Paper API is generated as Aussom classes with real argument names, each
backed by a generated Java class for that tier. Every class and method links
to Paper's own documentation rather than repeating it, since Paper is GPL
and this is Apache 2.0. Common types are available without an include;
anything else is one line:

```
include paper.trusted.Chunk;
```

## Tiers

Every script loads **untrusted**, wherever it sits, with no way to opt out.

| Tier | What it has |
| --- | --- |
| untrusted | reading state and sending messages |
| trusted | the full Paper API, less anything that leaves the game world |
| dangerous | the rest, plus AJI. Can take over or take down the server |

A tier is not a permission check. The Paper API is generated as a separate
set of Java classes per tier, each holding only that tier's methods, and the
interpreter's own `extern class` allowlist lets a script name only its own
tier's package. So a method a tier withholds is missing three times over:
the Aussom module does not declare it, the Java class does not have it, and
a script cannot name a class that does. There is nothing to refuse at
runtime because there is nothing to call.

Untrusted goes further. Trusted and dangerous are worked out from Paper's
API by rule; untrusted is a written list of 57 methods across 10 types and
13 events, small enough to read in one sitting. Rules decide from a method's
name and shape, and what matters is what it can do, so they kept granting
things nobody had chosen. Adding to that list is now a decision somebody
makes, and a Paper upgrade adds nothing to it on its own.

The API is the same at every tier: a script written untrusted keeps working
when it is elevated.

Untrusted can read the game world and public chat. It cannot read command
text, from a player, the console, or RCON, so a script nobody has vetted
cannot see the password in `/login`, or anyone's `/msg`, or what an operator
is doing. Public chat is readable because it is already public to everyone
in range.

A script cannot answer a command it does not own. Bukkit keeps a name with
whoever registered it first, and scripts load after every plugin has, so a
plugin always keeps its own commands. A short list of sensitive names,
`login` and `msg` among them, is refused outright even when nothing owns
them, since no script has a reason to answer those. The list is
`commands.protected` in `config.yml`.

Grants are keyed to a SHA-256 of the script's bytes, so moving or renaming a
script does not change what it may do, and **editing one revokes its grant**.

## Commands

`/ac` is a shorter alias for `/acraft`. Both names do the same thing.

| Command | What it does |
| --- | --- |
| `/acraft reload` | reload every script |
| `/acraft load <script> [--as <tier>]` | load or reload one script, including one not loaded yet |
| `/acraft unload <script>` | detach and stop one script |
| `/acraft list` | show loaded scripts and their tiers |
| `/acraft trust <script> [trusted\|dangerous]` | grant a tier |
| `/acraft untrust <script>` | revoke the grant |

Nothing watches the scripts directory. A file copied in while the server runs
stays inert until it is named, and `load` accepts a file that has never been
loaded, so adding a script does not mean reloading the ones already running.

There are two ways a script gets its tier, and they are different things.
`trust` writes a grant to the trust store and it stays until the file
changes or the grant is revoked. `load --as <tier>` applies a tier to that
one load and writes nothing, so the next `/acraft reload` puts the script
back to whatever it is granted. Use `--as` to try something, `trust` to
keep it.

`trust`, `untrust` and `load --as trusted` need `aussomcraft.trust`. The
dangerous tier needs `aussomcraft.dangerous`. The rest need
`aussomcraft.admin`. All default to op.

## Configuration

`plugins/AussomCraft/config.yml` sets the wall clock budget for one handler
run and how many overruns disable a script.

## Regenerating the Paper API

Needed when Paper releases a new version. Set `paper.api.version` in
`pom.xml`, and move `paper.javadoc.base` to match, or every generated link
will point at the previous API. Then:

```bash
mvn -Pgenerate process-classes
```

The generator runs at `process-classes`, not earlier: it is itself compiled
from `src/gen/java` and reads `untrusted-allowlist.txt` off the class path,
so both have to be built before it runs. Running `exec:java` on its own
regenerates from the previous copy of the allowlist and reports success,
which makes an edit look like it had no effect.

The generator deletes and rebuilds `src/main/java/com/lehman/aussomcraft/paper/gen`
and `src/main/resources/com/lehman/aussomcraft/aus/paper`, so nothing
outlives a regeneration. Review the result with `git diff`.

If generated output ever fails to compile, Maven cannot build the generator
that would fix it. Delete it first:

```bash
rm -rf src/main/java/com/lehman/aussomcraft/paper/gen
mvn -Pgenerate process-classes
```

**Use `mvn clean` after editing or restoring a generated file by hand.**
Maven recompiles on timestamps, and a file restored from a copy can be older
than the class already built from it, so the old class is kept and the build
silently runs code that is no longer in the source. With 3,346 generated
classes this is easy to do and hard to see: the build succeeds and the tests
report on something you already reverted.

## API documentation

`docs/` holds a Markdown page per Aussom class, generated from the sources
and readable in the GitHub browser. Regenerate it with the Aussom CLI
installed:

```bash
aussom gendoc.aus
```

That opens a window where you pick the tiers and the worker count. It
clears and rebuilds `docs/host` and `docs/paper` only, so anything else
under `docs/`, the guide included, is left alone.

## Build

```bash
mvn package
```

Expect around two minutes. The generated Paper API is 3,346 classes and
about 3.1 million lines, which is what makes each tier a separate compiled
API rather than a runtime check.

Your `mvn` must run on JDK 25, or you will get `release version 25 not
supported`:

```bash
JAVA_HOME=/path/to/jdk-25 mvn package
```

The jar lands at `target/AussomCraft-<version>.jar`. Drop it in `plugins/`.

## Tests

```bash
mvn test
```

Three layers. Plain JUnit for the rules and the generated surface,
MockBukkit for the plumbing that needs a server, and a pass on a real
Paper server for the class loader, which is the one thing MockBukkit
cannot speak to.

## Branding

AussomCraft(TM) is a trademark of Austin Lehman. The artwork in `branding/`
is not covered by the Apache License that applies to the code. You may use
the unmodified logo to refer to the project; you may not alter it, use it as
the mark of your own project, or use it in a way that suggests endorsement.
See [branding/README.md](branding/README.md).

## License

Copyright 2026 Austin Lehman

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy
of the License at

```
http://www.apache.org/licenses/LICENSE-2.0
```

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations
under the License.

The full text is in [LICENSE](LICENSE), and a copy travels inside the built
jar at `META-INF/LICENSE`.

### Third-party software

The jar bundles its runtime dependencies. Every one is Apache 2.0 except the
CUP parser runtime, which is under its own permissive license. Their required
notices are merged into `META-INF/NOTICE` in the jar, and the full list with
versions and terms is in [THIRD-PARTY.md](THIRD-PARTY.md).

`paper-api` is GPL 3.0, with some files dual licensed MIT. It is a `provided`
dependency, supplied by the server at runtime, so no part of it is
redistributed here.

The generated Paper modules carry no text from Paper's sources. Each class
and method links to Paper's own documentation instead of repeating it. See
[THIRD-PARTY.md](THIRD-PARTY.md) for what that means and what is still taken
from those sources.
