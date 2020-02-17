package version

trait Evolution[+A] {
  def entityName: String

  def evolution: List[A]
}
