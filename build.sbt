name := "arkon-scalatraining"

version := "0.1"

scalaVersion := "2.12.2"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "io.circe" %%	"circe-core" % "0.9.3",
  "io.circe" %% "circe-parser" % "0.9.3",
  "io.circe" %% "circe-generic" % "0.13.0",

  "org.sangria-graphql" %% "sangria" % "1.2.2",
  "org.sangria-graphql" %% "sangria-spray-json" % "1.0.0",
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.6.8",

  "org.slf4j" % "slf4j-nop" % "1.6.4",

  "org.scalatest" %% "scalatest" % "3.2.0" % Test,

  //Cats
  "org.typelevel" %% "cats-core" % "2.1.1",
  //Doobie
  "org.tpolecat" %% "doobie-core" % "0.8.8",
  "org.tpolecat" %% "doobie-hikari" % "0.8.8",
  "org.tpolecat" %% "doobie-postgres" % "0.8.8"
)
