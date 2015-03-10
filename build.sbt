name := "myproject"

version := "1.0"

lazy val admin = (project in file("modules/admin")).enablePlugins(PlayScala)

lazy val main = (project in file(".")).enablePlugins(PlayScala).aggregate(admin).dependsOn(admin)

scalacOptions += "-feature"

scalacOptions += "-language:reflectiveCalls"
