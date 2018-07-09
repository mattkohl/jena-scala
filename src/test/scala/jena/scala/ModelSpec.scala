package jena.scala

import org.apache.jena.rdf.model.{ResourceFactory => RF, ModelFactory => MF}
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
    "build from an iterable of statements" in new Fixture {
      val m = ScalaModel(Set(s1, s2))
      (m should have) size 2
    }
  }

  trait Fixture {
    val model: ScalaModel = MF.createDefaultModel.asScala
    val s1: Statement = RF.createStatement(
      RF.createResource("http://example.org/s1"),
      RF.createProperty("http://example.org/p1"),
      RF.createResource("http://example.org/o1")
    )
    val s2: Statement = RF.createStatement(
      RF.createResource("http://example.org/s2"),
      RF.createProperty("http://example.org/p2"),
      RF.createResource("http://example.org/o2")
    )
  }
}
