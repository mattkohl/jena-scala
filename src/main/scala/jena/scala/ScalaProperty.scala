package jena.scala

import org.apache.jena.rdf.model.{ResourceFactory => RF}

object ScalaProperty {
  def apply(uri: String): Property = RF.createProperty(uri)
}

case class ScalaProperty(property: Property)
