import sbt._

class Plugins(info : ProjectInfo) extends PluginDefinition(info) {
   val scctRepo = "scct-repo" at   "http://mtkopone.github.com/scct/maven-repo/"
   val snuggletex_repo = "snuggletex_repo" at "http://www2.ph.ed.ac.uk/maven2"
   val t_repo = "t_repo" at "http://tristanhunt.com:8081/content/groups/public/"
   
   lazy val posterous = "net.databinder" % "posterous-sbt" % "0.1.6"
}