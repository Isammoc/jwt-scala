import sbt._

object Dependencies {
  object V {
    val play = "2.6.0-RC2"
    val json4s = "3.5.2"
    val circe = "0.8.0"
    val scalatest = "3.2.0-SNAP4"
    val scalatestPlus = "3.0.0-RC1"
    val jmockit = "1.24"
    val apacheCodec = "1.10"
    val bouncyCastle = "1.57"
    val upickle = "0.4.4"
    val guice = "4.1.0"
  }

  object Libs {
    val play             = "com.typesafe.play" %% "play"      % V.play  % "provided"
    val playJson         = "com.typesafe.play" %% "play-json" % V.play  % "provided"
    val playTest         = "com.typesafe.play" %% "play-test" % V.play  % "test"
    val playTestProvided = "com.typesafe.play" %% "play-test" % V.play  % "provided"
    val guice            = "com.google.inject" %  "guice"     % V.guice % "test"

    val json4sCore    = "org.json4s" %% "json4s-core"    % V.json4s % "provided"
    val json4sNative  = "org.json4s" %% "json4s-native"  % V.json4s % "provided"
    val json4sJackson = "org.json4s" %% "json4s-jackson" % V.json4s % "provided"

    val circeCore     = "io.circe" %% "circe-core"    % V.circe
    val circeGeneric  = "io.circe" %% "circe-generic" % V.circe
    val circeParse    = "io.circe" %% "circe-parser"  % V.circe

    val upickle = "com.lihaoyi" %% "upickle" % V.upickle

    val apacheCodec = "commons-codec" % "commons-codec" % V.apacheCodec
    val bouncyCastle = "org.bouncycastle" % "bcpkix-jdk15on" % V.bouncyCastle

    val scalatest = "org.scalatest" %% "scalatest" % V.scalatest % "test"
    val scalatestPlus = "org.scalatestplus.play" %% "scalatestplus-play" % V.scalatestPlus % "test"
    val jmockit = "org.jmockit" % "jmockit" % V.jmockit % "test"
  }
}
