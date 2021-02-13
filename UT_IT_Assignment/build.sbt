name := "UT_IT_Assignment"

version := "1.0"

scalaVersion := "2.12.12"

lazy val Ques_1_2 = project.in(file("Ques_1_2")).settings(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.3" % Test,
    "org.mockito" %% "mockito-scala" % "1.16.15" % Test
  )
)
lazy val Ques_3 = project.in(file("Ques_3")).settings(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.3" % Test,
    "org.mockito" %% "mockito-scala" % "1.16.15" % Test
  )
)
lazy val root = project.in(file(".")).aggregate(Ques_1_2, Ques_3)