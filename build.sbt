import ReleaseTransformations._

scalaVersion := "3.7.0"

enablePlugins(JavaAppPackaging)

lazy val root = (project in file(".")).
  settings(
    name := "addition",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
  )

  releaseProcess := Seq[ReleaseStep](
    setNextVersion
    commitReleaseVersion,              
    tagRelease,
  )