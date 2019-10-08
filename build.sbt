organization := "com.guizmaii.sbt"
name := "sbt-elm"
sbtPlugin := true

scalaVersion := "2.12.10"

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")
enablePlugins(SbtPlugin)

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayOrganization := Some("guizmaii")
credentials += Credentials(Path.userHome / ".bintray" / ".credentials")
bintrayReleaseOnPublish := true
publishMavenStyle := true

pomExtra := (
  <url>https://github.com/guizmaii/sbt-elm</url>
  <scm>
    <url>git@github.com:guizmaii/sbt-elm.git</url>
    <connection>scm:git:git@github.com:guizmaii/sbt-elm.git</connection>
  </scm>
  <developers>
    <developer>
      <id>choucrifahed</id>
      <name>Choucri FAHED</name>
      <url>https://github.com/choucrifahed</url>
    </developer>
    <developer>
      <id>guizmaii</id>
      <name>Jules Ivanic</name>
      <url>https://github.com/guizmaii</url>
    </developer>
  </developers>
)

scriptedLaunchOpts ++= Seq("-Dplugin.version=" + version.value)
