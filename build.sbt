import Dependencies._

ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "snyk-cli-bug",
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.9.2",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.9.9",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.9.9",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % "2.9.9",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.9.9"
    ),
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
