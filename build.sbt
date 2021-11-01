val `hydraScala3Import` = project.in(file("."))
  .settings(
    scalaVersion := "2.13.6",
    scalacOptions ++= Vector(
      "-Xsource:3"
    )
  )
