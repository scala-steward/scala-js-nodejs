package io.scalajs.nodejs.os

import org.scalatest.funsuite.AnyFunSuite

class NodeJS14Test extends AnyFunSuite {
  test("version") {
    assert(OS.version().isInstanceOf[String])
    assert(OS.version().nonEmpty)
  }
}
