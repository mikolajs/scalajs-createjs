lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js CreateJS"

normalizedName := "scalajs-createjs"

version := "0.0.3"

organization := "com.scalawarrior"

scalaVersion := "2.12.8"


libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.9.7"


scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"
)

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
