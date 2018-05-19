package jena.scala

case class ScalaModel(model: Model) {

  def size: Long = model.size

  def createResource(uri: String): Resource = model.createResource(uri)

  def createProperty(nameSpace: String, localName: String): Property = model.createProperty(nameSpace, localName)

  def createLiteral(v: String, language: String): Literal = model.createLiteral(v, language)

}
