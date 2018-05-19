package jena.scala

import org.apache.jena.datatypes.RDFDatatype

case class ScalaResource(resource: Resource) {

  def addProperty(p: Property, o: String): Resource = resource.addProperty(p, o)
  def addProperty(p: Property, o: String, l: String): Resource = resource.addProperty(p, o, l)
  def addProperty(p: Property, lexicalForm: String, datatype: RDFDatatype): Resource = resource.addProperty(p, lexicalForm, datatype)
  def addProperty(p: Property, o: RDFNode): Resource = resource.addProperty(p, o)

}
