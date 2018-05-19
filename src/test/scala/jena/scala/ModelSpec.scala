package jena.scala

import org.apache.jena.rdf.model.{ModelFactory => MF}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class ModelSpec extends WordSpec with Matchers {

  "model" can {
    "add properties" in new Fixture {

      val s: Resource = model.createResource("http://example.org/subject")
      val p: Property = model.createProperty("http://example.org/", "predicate")
      val o: Literal = model.createLiteral("object", "en")

      s.addProperty(p, o)

      (model should have) size 1
    }
  }

  trait Fixture {
    val model: ScalaModel = MF.createDefaultModel.asScala
  }
}
