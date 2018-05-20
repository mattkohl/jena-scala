package jena.scala

import org.apache.jena.datatypes.RDFDatatype
import org.apache.jena.rdf.model.ResourceFactory

object ScalaLiteral {
  def apply(value: String): Literal = ResourceFactory.createPlainLiteral(value)
  def apply(value: String, dataType: RDFDatatype): Literal = ResourceFactory.createTypedLiteral(value, dataType)
}

case class ScalaLiteral(literal: Literal)
