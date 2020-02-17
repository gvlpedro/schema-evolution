package model

import version.Evolution

/**
  * In order to get versions from 'Product' entity.
  *
  * @param products
  */
case class ProductEvolution(products: List[Product]) extends Evolution[Product] {
  override def entityName: String = "Product"

  override def evolution: List[Product] = products

  override def toString: String = s"List ${products.map(_.version)}"
}
