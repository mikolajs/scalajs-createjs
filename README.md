scalajs-createjs
===============

Static types for the [CreateJS](http://createjs.com/) API for [Scala.js](http://www.scala-js.org/) programs.

scala 2.12
sbt 0.13.13
scalajs-dom 0.9.1
Usage
-----
Clone
Run in sbt: package, publishLocal
Add the following to your sbt build definition:
WORK ONLY WITH LOCAL REPO
```scala

libraryDependencies += "com.scalawarrior" %%% "scalajs-createjs" % "0.0.2"
```
and add following import statement to the head of your Scala.js program:

```scala
import com.scalawarrior.scalajs.createjs._
```

then enjoy CreateJS in Scala.js!

```scala
// Declare the stage
val canvas = dom.document.createElement("canvas").asInstanceOf[Canvas]
val w = 850
val h = 550
canvas.width = w
canvas.height = h
dom.document.body.appendChild(canvas)
val stage = new Stage(canvas)


var back = new Shape();
back.graphics.beginFill("#6f6")
back.graphics.drawRect(0, 0, w, h)
stage.addChild(back)

val village = new Bitmap("src/home.png")
village.x = 100
village.y = 50
stage.addChild(village)
stage.update()
```
