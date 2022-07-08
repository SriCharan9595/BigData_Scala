object Tuple {

  def main(arguments: Array[String]) = {

    SetMap(key = "start")

    println("Tuple Started")

  }

  def SetMap( key: String ) : String = {

    val dataTuple = (18, "sricharan", 103f, true)
    println(dataTuple._2)
    println(dataTuple._3)

    val blockchainList = Set("btc", "ltc", "bnb", "btc", "eth") // set may contains duplicate elements,
    // while any operation it takes real count only

    val blockchainMap = Map(10001 -> "bitcoin", 10002 -> "litecoin", 10003 -> "binance",
      10004 -> "shiba inu", 10005 -> "etherium")
    blockchainList.foreach( lang =>  println(lang) )

    println(key)
    return "Success"

  }

}
