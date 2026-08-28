# Third-party software in AussomCraft

AussomCraft is distributed as one jar with its runtime dependencies inside
it. This file lists everything in that jar that someone else wrote, and the
terms it comes under. It is the record required by Apache License 2.0
section 4, and by the CUP license's requirement that its notice travel with
the code.

To regenerate the list of what is actually bundled:

```
mvn dependency:list -DincludeScope=runtime
```

## Bundled and redistributed

| Library | Version | License |
|---|---|---|
| [aussom.base](https://gitlab.com/cupofcode/aussom) | 1.4.7 | Apache License 2.0 |
| [Apache Commons CLI](https://commons.apache.org/proper/commons-cli/) | 1.11.0 | Apache License 2.0 |
| [Apache Commons Codec](https://commons.apache.org/proper/commons-codec/) | 1.22.1 | Apache License 2.0 |
| [json-simple](https://code.google.com/archive/p/json-simple/) | 1.1.1 | Apache License 2.0 |
| [CUP Parser Generator runtime](http://www2.cs.tum.edu/projects/cup/) | 11b-20160615 | CUP license, below |

The Apache License 2.0 text is in the LICENSE file at the root of this
project and in META-INF/LICENSE inside the jar. The NOTICE files of the
Apache licensed libraries above are merged into META-INF/NOTICE inside the
jar at build time.

aussom.base 1.4.7 carries two files of its own. META-INF/LICENSE.txt is the
Apache 2.0 text, and META-INF/THIRD-PARTY-NOTICES.txt covers the four
libraries it brings with it. No shade transformer claims either path, so
both travel into this jar unchanged and sit alongside the merged NOTICE.

Three of the bundled libraries write META-INF/LICENSE.txt and the shade
keeps one of them. That is harmless because all three are the same Apache
2.0 text. This project's own copy is at META-INF/LICENSE, which is a
different path, so nothing can displace it.

## Compiled against, not redistributed

`paper-api` is a `provided` dependency. It is needed to build AussomCraft
and is supplied by the server at runtime, so no part of it is included in
the jar this project produces.

| Library | Version | License |
|---|---|---|
| [paper-api](https://github.com/PaperMC/Paper) | 26.2.build.112-stable | GNU General Public License v3.0, with some files dual licensed MIT |

Paper inherits the GPL from Spigot, which inherits it from Bukkit and
CraftBukkit. AussomCraft is Apache 2.0, which is one-way compatible with
GPLv3: Apache 2.0 licensed work may be combined into a GPLv3 work, but not
the reverse. This is the same position every other Apache or MIT licensed
Paper plugin is in.

### Documentation in the generated modules

The generated Paper modules carry no text from Paper's sources. Each
generated class and method links to Paper's own documentation instead:

```
/**
 * Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockPower()
 *
 * @r An int.
 */
public extern getBlockPower();
```

An earlier version of the generator copied Paper's descriptions into every
module. Paper is GPL 3.0, so that put about three quarters of the generated
content by volume under a different license inside an Apache 2.0 jar. The
generator no longer reads those descriptions at all.

What is still taken from Paper's sources is parameter names. A name is not
prose, it is needed to call the method, and there is no other way to write
it. Method names and signatures are used for the same reason, which is the
same basis every plugin builds on.

The version in those links is set by `paper.javadoc.base` in the pom and has
to move when `paper.api.version` moves.

## CUP Parser Generator license

The CUP runtime is reached through aussom.base, which uses a CUP generated
parser. Its license requires this notice be retained.

```
CUP Parser Generator Copyright Notice, License, and Disclaimer

Copyright 1996-2015 by Scott Hudson, Frank Flannery, C. Scott Ananian,
Michael Petter

Permission to use, copy, modify, and distribute this software and its
documentation for any purpose and without fee is hereby granted, provided
that the above copyright notice appear in all copies and that both the
copyright notice and this permission notice and warranty disclaimer appear
in supporting documentation, and that the names of the authors or their
employers not be used in advertising or publicity pertaining to
distribution of the software without specific, written prior permission.

The authors and their employers disclaim all warranties with regard to
this software, including all implied warranties of merchantability and
fitness. In no event shall the authors or their employers be liable for
any special, indirect or consequential damages or any damages whatsoever
resulting from loss of use, data or profits, whether in an action of
contract, negligence or other tortious action, arising out of or in
connection with the use or performance of this software.
```
