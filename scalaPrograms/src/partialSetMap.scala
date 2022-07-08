object partialSetMap {

  def main(args: Array[String]) = {

    val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val prunedSet = mySet -- List("Michigan", "Ohio")
    println(prunedSet)


    val firstSet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    val secondSet = Set("Wisconsin", "Michigan", "Minnesota")
    val prunedSet2 = firstSet intersect secondSet
    println(prunedSet2)


    val list = List(4, 6, 7, 8, 9, 13, 14)
    val partialFunction1: PartialFunction[Int, Int] = {
      case x: Int if x % 2 == 0 => x * 3
    }
    val partialFunction2: PartialFunction[Int, Int] = {
      case y: Int if y % 2 != 0 => y * 4
    }
    val result = list.collect(partialFunction1 orElse partialFunction2)
    println(result)


    val s = Seq("redis", "memcache", "docker")
    val r = s map {
      _.reverse
    }
    println(r)


  }

}
