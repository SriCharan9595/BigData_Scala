object hofPrePost {

  def main(args: Array[String]) = {
    val fName = "Kurapati"
    val lName = "Sricharan"
    val nameFix = computeData(preName,fName, lName)
    println(nameFix)
  }
  def preName(fName: String, lName: String): String = {
    fName + " " + lName
  }
  def postName(fName: String, lName: String): String = {
    lName + " " + fName
  }
  def computeData(func: (String, String) => String, fName: String, lName: String): String = {
    func(fName, lName)
  }

}
