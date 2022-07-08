object ListObject {

  def main(arguments: Array[String]) = {

    languages(18)
    println("Learning Programming languages")

  }

  def languages(id: Int): String = {

    val programLang = List("C", "DotNet", "Java", "Angular", "Node")
    println( programLang(3) )
    programLang.foreach( lang =>  println(lang) )

    val myLang = programLang.map ( lang => lang.toUpperCase )
    myLang.foreach( lang =>  println(lang) )

    val myLang2 = programLang.map ( lang => lang.length )
    myLang2.foreach( lang =>  println(lang) )

    val rangeList = List.range(1, 11)
    val events = rangeList.filter((i: Int) => i % 2 == 0)
    println(events)

    return "Completed";
  }

}


