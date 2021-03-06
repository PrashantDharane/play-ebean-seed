name := """play-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  "mysql" % "mysql-connector-java" % "5.1.38"
)

enablePlugins(PlayEbean)