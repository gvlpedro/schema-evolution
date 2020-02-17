import Dependencies._

ThisBuild / scalaVersion := "2.11.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "schema-evolution"
  )

val sparkVersion = "2.4.0"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
)

resolvers += Resolver.mavenLocal
