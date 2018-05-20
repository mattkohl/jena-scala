package jena.scala

import org.apache.jena.datatypes.RDFDatatype
import org.apache.jena.rdf.model.{ResourceFactory => RF}

object ScalaResource {
  def apply(uri: String): Resource = RF.createResource(uri)
}

case class ScalaResource(resource: Resource) {

  def addProperty(p: Property, o: String): Resource = resource.addProperty(p, o)
  def addProperty(p: Property, o: String, l: String): Resource = resource.addProperty(p, o, l)
  def addProperty(p: Property, lexicalForm: String, datatype: RDFDatatype): Resource = resource.addProperty(p, lexicalForm, datatype)
  def addProperty(p: Property, o: RDFNode): Resource = resource.addProperty(p, o)

}
