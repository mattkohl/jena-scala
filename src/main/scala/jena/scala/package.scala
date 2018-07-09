package jena

import org.apache.jena.query
import org.apache.jena.rdf.model
import org.apache.jena.sparql.core

package object scala {
  type AnonId = model.AnonId
  type Dataset = query.Dataset
  type Literal = model.Literal
  type Model = model.Model
  type Property = model.Property
  type Quad = core.Quad
  type RDFNode = model.RDFNode
  type Resource = model.Resource
  type Statement = model.Statement

  implicit class AnonIdAsScala(m: AnonId) {
    def asScala = ScalaAnonId(m)
  }

  implicit class AnonIdAsJava(m: ScalaAnonId) {
    def asJava: AnonId = m.anonId
  }

  implicit class DatasetAsScala(m: Dataset) {
    def asScala = ScalaDataset(m)
  }

  implicit class DatasetAsJava(m: ScalaDataset) {
    def asJava: Dataset = m.dataset
  }

  implicit class LiteralAsScala(m: Literal) {
    def asScala = ScalaLiteral(m)
  }

  implicit class LiteralAsJava(m: ScalaLiteral) {
    def asJava: Literal = m.literal
  }

  implicit class ModelAsScala(m: Model) {
    def asScala = ScalaModel(m)
  }

  implicit class ModelAsJava(m: ScalaModel) {
    def asJava: Model = m.model
  }

  implicit class PropertyAsScala(m: Property) {
    def asScala = ScalaProperty(m)
  }

  implicit class PropertyAsJava(m: ScalaProperty) {
    def asJava: Property = m.property
  }

  implicit class QuadAsScala(m: Quad) {
    def asScala = ScalaQuad(m)
  }

  implicit class QuadAsJava(m: ScalaQuad) {
    def asJava: Quad = m.quad
  }

  implicit class RDFNodeAsScala(m: RDFNode) {
    def asScala = ScalaRDFNode(m)
  }

  implicit class RDFNodeAsJava(m: ScalaRDFNode) {
    def asJava: RDFNode = m.rdfNode
  }

  implicit class ResourceAsScala(m: Resource) {
    def asScala = ScalaResource(m)
  }

  implicit class ResourceAsJava(m: ScalaResource) {
    def asJava: Resource = m.resource
  }

  implicit class StatementAsScala(m: Statement) {
    def asScala = ScalaStatement(m)
  }

  implicit class StatementAsJava(m: ScalaStatement) {
    def asJava: Statement = m.statement
  }

}
