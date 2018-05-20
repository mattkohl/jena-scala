package jena.scala

import org.apache.jena.rdf.model.{ResourceFactory => RF}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class PropertySpec extends WordSpec with Matchers {

  "property" can {
    "be instantiated like a case class" in {
      val p: Property = ScalaProperty("http://example.org/predicate")
      p.getLocalName shouldBe "predicate"

      val p2: Property = RF.createProperty("http://example.org/predicate")
      (p equals p2) shouldBe true
    }
  }

}
