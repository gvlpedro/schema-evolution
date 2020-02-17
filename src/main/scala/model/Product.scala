package model

trait Product {
  def version: String

  def ingestedBy: String

  def description: String

  def date: String
}
