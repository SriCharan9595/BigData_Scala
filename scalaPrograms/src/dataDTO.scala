object dataDTO {

  val databases = List("MySql", "Postgresql", "MsSql", "MongoDB")

  def main(args: Array[String]) = {
    useData("start")
  }

  def useData(key : String) = {

    databases.foreach(each => println(each))

    val dataDTOMappedList = databases.map(each => {
      DataHolderDTO(each, each.size)
    })

    dataDTOMappedList.foreach(each => println(each))

    println(key)
  }

  case class DataHolderDTO(name: String, lengthOfTheName : Int)

}
// getter and setter
// POJO
// VO
// DTO
