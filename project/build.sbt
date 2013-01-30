name := "concurrent-unrolled-queue"

version := "0.1"

mainClass in (Test, test) := Some("test.ConcurrentAddRemoveTest")

scalaVersion := "2.10.0"

scalacOptions ++= Seq("-deprecation", "-optimise")

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9" % "test" cross CrossVersion.binary
