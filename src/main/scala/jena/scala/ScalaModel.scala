package jena.scala

import org.apache.jena.rdf.model.{ModelFactory => MF}

case class ScalaModel(model: Model) {
  def size: Long = model.size
  def createResource(uri: String): Resource = model.createResource(uri)
  def createProperty(nameSpace: String, localName: String): Property = model.createProperty(nameSpace, localName)
  def createLiteral(v: String, language: String): Literal = model.createLiteral(v, language)
}

object ScalaModel {
  def apply[T <: Iterable[Statement]](statements: T): ScalaModel = {
    val model: Model = MF.createDefaultModel
    statements foreach model.add
    new ScalaModel(model)
  }
}
