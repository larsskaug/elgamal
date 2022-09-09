lazy val root = (project in file("."))
  .settings(
    name := "elgamal",
    scalaVersion := "2.13.8",
    version := "0.0.1",

    libraryDependencies ++= Seq("org.bouncycastle" % "bcprov-jdk15on" % "1.70",
      "org.bouncycastle" % "bcpkix-jdk15on" % "1.70"
    )
  )

assembly/assemblyMergeStrategy := {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
  }