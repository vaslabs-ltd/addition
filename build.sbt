
scalaVersion := "3.7.0"

lazy val root = (project in file(".")).
  settings(
    name := "addition",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
  )