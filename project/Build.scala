import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "mintpresso"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.mintpresso" %% "mintpresso" % "0.1.9"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ) dependsOn (
    RootProject(uri("git://github.com/admire93/Affogato.git"))
  )

}
