name := "hello-scala-sbt"

version := "1.0"

scalaVersion := "2.11.6"

mainClass in (Compile, run) := Some("hello.HelloApp")