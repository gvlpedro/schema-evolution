package driver

import model.{CategoryA, CategoryA1, CategoryB, ProductEvolution}
import com.typesafe.scalalogging._
import org.slf4j.LoggerFactory

class App {
  val logger = Logger(LoggerFactory.getLogger(this.getClass))

  def main(args: Array[String]): Unit = {

    logger.info("Tracking versions for products:")

    val categoryA = new CategoryA("0.0.1", "kafka: topic01", "CategoryA", "20190122")
    val categoryA1 = new CategoryA1("0.0.2", "kafka: topic01.1", "CategoryA1", "20190122")
    val categoryB = new CategoryB("0.2.1", "kafka: topic02", "CategoryB", "20190122")

    val productEvolution = ProductEvolution(List(categoryA, categoryB, categoryA1))

    logger.debug(productEvolution.toString)
  }
}
