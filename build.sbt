val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "solrs",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "com.github.takezoe" %% "solr-scala-client" % "0.0.27",
      "com.novocode" % "junit-interface" % "0.11" % "test"
  )
)