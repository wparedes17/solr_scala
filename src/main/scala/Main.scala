import com.github.takezoe.solr.scala._

@main def run(): Unit =
  val client = new SolrClient("dirección de solr")
  
  client
    .add(Map("jobappid" -> "999999", 
      "jobid" -> "12345",
      "status" -> "1",
      "date" -> "2022-01-03 00:00:00.000",
      "loginid" -> "pruebas75",
      "resumeid" -> "55555",
      "scorecandidate" -> "0.9",
      "origin" -> "0",
      "dateexpires" -> "2021-01-04 00:00:00.000",
      "dateindex" -> "2021-01-03 00:00:00.000"))
    .commit()