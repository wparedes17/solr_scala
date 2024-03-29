val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-world",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "com.github.takezoe" %% "solr-scala-client" % "0.0.27",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
