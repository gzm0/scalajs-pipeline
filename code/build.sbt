enablePlugins(ScalaJSPlugin)

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-Xprint:typer",
  "-Xprint:jsinterop",
  "-Xprint:mixin"
)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"
