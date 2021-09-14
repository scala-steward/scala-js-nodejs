package io.scalajs.nodejs

import org.scalatest.funsuite.AnyFunSuite

class AbortControllerTest extends AnyFunSuite {
  test("AbortController") {
    val ac = new AbortController()
    assert(ac.signal != null)
  }

  test("AbortSignal") {
    val as = AbortSignal.abort()
    assert(as.aborted)
  }
}
