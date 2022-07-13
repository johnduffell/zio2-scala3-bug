# zio2-scala3-bug

Running `sbt compile` causes this error

```
$ sbt compile
[info] welcome to sbt 1.7.1 (AdoptOpenJDK Java 1.8.0_275)
[info] loading settings for project global-plugins from plugins.sbt ...
[info] loading global plugins from /Users/john_duffell/.sbt/1.0/plugins
[info] loading project definition from /Users/john_duffell/code/zio2-scala3-bug/project
[info] loading settings for project root from build.sbt ...
[info] set current project to zio2-scala3-bug (in build file:/Users/john_duffell/code/zio2-scala3-bug/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 2 Scala sources to /Users/john_duffell/code/zio2-scala3-bug/target/scala-3.1.3/classes ...
[error] -- Error: /Users/john_duffell/code/zio2-scala3-bug/src/main/scala/Testing.scala:11:21 
[error] 11 |    zioEffect.provide(
[error]    |    ^
[error]    |Exception occurred while executing macro expansion.
[error]    |java.lang.AssertionError: assertion failed: Cannot get tree of no symbol
[error]    |    at scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
[error]    |    at dotty.tools.dotc.quoted.reflect.FromSymbol$.definitionFromSym(FromSymbol.scala:15)
[error]    |    at dotty.tools.dotc.quoted.reflect.FromSymbol$.$anonfun$4(FromSymbol.scala:34)
[error]    |    at scala.collection.immutable.List.map(List.scala:250)
[error]    |    at dotty.tools.dotc.quoted.reflect.FromSymbol$.classDef(FromSymbol.scala:34)
[error]    |    at dotty.tools.dotc.quoted.reflect.FromSymbol$.definitionFromSym(FromSymbol.scala:17)
[error]    |    at scala.quoted.runtime.impl.QuotesImpl$reflect$SymbolMethods$.tree(QuotesImpl.scala:2526)
[error]    |    at scala.quoted.runtime.impl.QuotesImpl$reflect$SymbolMethods$.tree(QuotesImpl.scala:2526)
[error]    |    at izumi.reflect.dottyreflection.Inspector.inspectSymbolTree(Inspector.scala:120)
[error]    |    at izumi.reflect.dottyreflection.Inspector.inspectTypeRepr(Inspector.scala:70)
[error]    |    at izumi.reflect.dottyreflection.Inspector.buildTypeRef(Inspector.scala:18)
[error]    |    at izumi.reflect.dottyreflection.TypeInspections$.apply(TypeInspections.scala:9)
[error]    |    at izumi.reflect.dottyreflection.Inspect$.inspectAny(Inspect.scala:15)
[error]    |
[error] 12 |      layerSub, layerGet
[error] 13 |    )
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
[error] Total time: 10 s, completed 13-Jul-2022 17:53:19
3
```
