# AussomCraft Documentation

## Guide

New to this? The [guide](guide/) is written for people who have
not written code before. Start there.

## API reference

Generated from the Aussom sources. Do not edit.

## Host API

The externs every script gets: events, commands, the scheduler,
the per script store, and the server.

- [host](host/)

## Paper API

One page per Paper type, per tier. A tier is a superset of the
one below it, so a script written for a lower tier keeps working
when it is elevated.

- [untrusted](paper/untrusted/) - reading state and sending messages
- [trusted](paper/trusted/) - the full Paper API, less anything that leaves the game world
- [dangerous](paper/dangerous/) - the rest, plus AJI

