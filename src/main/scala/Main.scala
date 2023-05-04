import scala.io.Source
import com.github.takezoe.solr.scala._

object Indexer {
  def readFile(filename: String): String = {
    val fileContent = Source.fromFile(filename + ".txt").mkString
    return(fileContent)
  }

  def readDocumentList(filename: String): Array[String] = {
    val fileLines = Source.fromFile(filename).getLines().toArray
    return(fileLines)
  }

  def defSolrClient(): SolrClient = {
    val client = new SolrClient("http://localhost:8983/solr/doctos_testing")
    return(client)
  }
  def indexDocument(client: SolrClient, title: String, content: String, id: String): Unit = {
    val document = Map(
      "id" -> id,
      "title" -> title,
      "content" -> content
    )
    client.add(document)
    client.commit()
    println("Document indexed")
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    var id: Int = 1
    val client = Indexer.defSolrClient()
    val documentList = Indexer.readDocumentList("lista.txt")
    for (documentTitle <- documentList){
      var content = Indexer.readFile(documentTitle)
      Indexer.indexDocument(client, documentTitle, content, id.toString)
      id += 1
    }
  }
}

