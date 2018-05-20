package jena.scala

import org.apache.jena.rdf.model.{ResourceFactory => RF}
import org.apache.jena.datatypes.xsd.XSDDatatype
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class LiteralSpec extends WordSpec with Matchers {

  "literal" can {
    "be instantiated like a case class" in {
      val o: Literal = ScalaLiteral("object")
      o.getLexicalForm shouldBe "object"

      val o2: Literal = RF.createPlainLiteral("object")
      (o equals o2) shouldBe true

      val o3: Literal = ScalaLiteral("1", XSDDatatype.XSDinteger)

      val o4: Literal = RF.createTypedLiteral("1", XSDDatatype.XSDinteger)
      (o3 equals o4) shouldBe true
    }
  }

}
