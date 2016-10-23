scalaVersion := "2.11.8"
name := "website"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


libraryDependencies += "org.webjars" % "bootstrap" % "3.3.7-1"
libraryDependencies += "org.webjars.npm" % "react" % "15.3.2"
libraryDependencies += "org.webjars.npm" % "react-dom" % "15.3.2"
