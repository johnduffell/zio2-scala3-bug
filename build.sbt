ThisBuild / scalaVersion     := "3.1.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "zio2-scala3-bug",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0",
      "dev.zio" %% "zio-test" % "2.0.0" % Test,
      "com.softwaremill.sttp.client3" %% "zio-json" % "3.6.2",
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
