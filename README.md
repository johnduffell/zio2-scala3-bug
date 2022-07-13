# zio2-scala3-bug

Running `sbt clean;compile` causes this error,
however as you can see a second/incremental compile does work sometimes.

```
[IJ]clean;compile
[success] Total time: 0 s, completed 13 Jul 2022, 22:43:05
[info] compiling 2 Scala sources to /Users/john_duffell/code/zio2-scala3-bug/target/scala-3.1.3/classes ...
[error] -- Error: /Users/john_duffell/code/zio2-scala3-bug/src/main/scala/Testing.scala:12:31 
[error] 12 |  val error = zioEffect.provide(layer1, layer2)
[error]    |              ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
[error]    |Exception occurred while executing macro expansion.
[error]    |java.lang.AssertionError: assertion failed: Cannot get tree of no symbol
[error]    |	at scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
[error]    |	at dotty.tools.dotc.quoted.reflect.FromSymbol$.definitionFromSym(FromSymbol.scala:15)
[error]    |	at dotty.tools.dotc.quoted.reflect.FromSymbol$.$anonfun$4(FromSymbol.scala:34)
[error]    |	at scala.collection.immutable.List.map(List.scala:246)
[error]    |	at dotty.tools.dotc.quoted.reflect.FromSymbol$.classDef(FromSymbol.scala:34)
[error]    |	at dotty.tools.dotc.quoted.reflect.FromSymbol$.definitionFromSym(FromSymbol.scala:17)
[error]    |	at scala.quoted.runtime.impl.QuotesImpl$reflect$SymbolMethods$.tree(QuotesImpl.scala:2526)
[error]    |	at scala.quoted.runtime.impl.QuotesImpl$reflect$SymbolMethods$.tree(QuotesImpl.scala:2526)
[error]    |	at izumi.reflect.dottyreflection.Inspector.inspectSymbolTree(Inspector.scala:120)
[error]    |	at izumi.reflect.dottyreflection.Inspector.inspectTypeRepr(Inspector.scala:70)
[error]    |	at izumi.reflect.dottyreflection.Inspector.buildTypeRef(Inspector.scala:18)
[error]    |	at izumi.reflect.dottyreflection.TypeInspections$.apply(TypeInspections.scala:9)
[error]    |	at izumi.reflect.dottyreflection.Inspect$.inspectAny(Inspect.scala:15)
[error]    |
[error]    |----------------------------------------------------------------------------
[error]    |Inline stack trace
[error]    |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]    |This location contains code that was inlined from Inspect.scala:11
[error]    |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]    |This location contains code that was inlined from Inspect.scala:11
[error]    |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]    |This location contains code that was inlined from Inspect.scala:11
[error]    |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]    |This location contains code that was inlined from Inspect.scala:11
[error]    |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]    |This location contains code that was inlined from Inspect.scala:11
[error]     ----------------------------------------------------------------------------
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 2 s, completed 13 Jul 2022, 22:43:06
[IJ]compile
[info] compiling 1 Scala source to /Users/john_duffell/code/zio2-scala3-bug/target/scala-3.1.3/classes ...
[info] done compiling
[success] Total time: 1 s, completed 13 Jul 2022, 22:43:15
[IJ]
```
