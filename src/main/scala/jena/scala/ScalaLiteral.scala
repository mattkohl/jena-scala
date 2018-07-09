package jena.scala

import org.apache.jena.datatypes.RDFDatatype
import org.apache.jena.datatypes.xsd.XSDDatatype
import org.apache.jena.rdf.model.{ResourceFactory => RF}

case class ScalaLiteral(literal: Literal)

object ScalaLiteral {
  def apply(value: String): Literal = RF.createPlainLiteral(value)
  def apply(value: String, dataType: RDFDatatype): Literal = RF.createTypedLiteral(value, dataType)
  def apply(value: Int): Literal = RF.createTypedLiteral(value.toString, XSDDatatype.XSDinteger)
  def apply(value: Boolean): Literal = RF.createTypedLiteral(value.toString, XSDDatatype.XSDboolean)
  def apply(value: Double): Literal = RF.createTypedLiteral(value.toString, XSDDatatype.XSDdouble)
}
