package list
import scala.collection.mutable.ArrayBuffer

object printLists extends App {

  println("These are the languages:")

  for (i <- 0 until bestLanguage.languages.length){
    if (bestLanguage.languages(i) == "Scala") {
      println("Iam learning you")
    }

    else {
      println(bestLanguage.languages(i))
    }
  }
  println("***********")
  println("")

  bestSites.sites += "AirBnB"  //Adding air bnb in the Array buffer.
  println(bestSites.sites)

  bestSites.sites.trimEnd(2)
  println(bestSites.sites)
  bestSites.sites.trimStart(2)
  println(bestSites.sites)
}

object bestLanguage{

  val languages = Array("GO", "Scala", "Java", "PHP", "#C")
}

object bestSites {
  val sites = ArrayBuffer("Facebook", "Google", "Itunes", "Uber")
}
