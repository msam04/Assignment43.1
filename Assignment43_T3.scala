package Assignment43_T3

import scala.io.Source;

object Assignment43_T3 {
  def main(args: Array[String]) {
    val num_lines = Source.fromFile("/home/acadgild/sample_text").getLines.length
    println("Number of lines in the file: " + num_lines)
    val contents = Source.fromFile("/home/acadgild/sample_text").getLines.mkString
    println("Number of words: " + contents.split(" ").length)
    val contents_dashed = Source.fromFile("/home/acadgild/dashed").getLines.mkString
    println("Number of words in dashed doc: " + contents_dashed.split("-").length)
  } 
  
}