package util

import org.apache.spark.sql.{Encoder, SparkSession}
import org.apache.spark.sql.types.StructType

object SchemaConverter {

  def structType(clazz: Product)(implicit spark: SparkSession): StructType = {
    import spark.implicits._
    implicitly[Encoder[Product]].schema
  }
}
