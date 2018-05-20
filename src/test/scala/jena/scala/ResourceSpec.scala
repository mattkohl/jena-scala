package jena.scala

import org.apache.jena.rdf.model.{ResourceFactory => RF}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class ResourceSpec extends WordSpec with Matchers {

  "resource" can {
    "be instantiated like a case class" in {
      val s: Resource = ScalaResource("http://example.org/subject")
      s.getLocalName shouldBe "subject"

      val s2: Resource = RF.createResource("http://example.org/subject")
      (s equals s2) shouldBe true
    }
  }

}
