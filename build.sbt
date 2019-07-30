name := "hello-scala-sbt"

version := "1.1"

scalaVersion := "2.13.0"

mainClass in (Compile, run) := Some("hello.HelloApp")
