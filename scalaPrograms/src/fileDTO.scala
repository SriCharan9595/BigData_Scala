object fileDTO {
    def main(args: Array[String]) = {

      val file = io.Source.fromFile("C:/Users/VC/Downloads/auth.csv")
      val fileContent = file.getLines()
      for (each <- fileContent.take(10)) {
        val cols = each.split(",")
        println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}|${cols(5)}|${cols(6)}|${cols(7)}|${cols(8)}|${cols(9)}|${cols(10)}")

      }
    }
  case class dataInFileDTO(auth_code:String, subreq_id:String,  aua:String,  sa:String, asa:String,
                           ver:String,  tid:String,  license_id:String, req_datetime:String, tkn_used_flag:String)

}

