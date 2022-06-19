ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaKatas"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % Test

resolvers += "Scala-Tools Maven2 Repository" at "https://www.scala-tools.org/repo-releases/"
