object File {

  def main(args: Array[String]) = {

    val file = io.Source.fromFile("C:/Users/VC/Downloads/auth.csv")

    val fileContent = file.getLines()

    for (each <- fileContent) {

      //each.split(",")
      println(each)
    }

  }

}