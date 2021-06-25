package io.scalajs.nodejs.crypto

import org.scalatest.funsuite.AnyFunSuite

class CryptoNodeJS14Test extends AnyFunSuite {
  test("randomInt") {
    val i1 = Crypto.randomInt(10)
    assert(0 <= i1 && i1 <= 10)

    val i2 = Crypto.randomInt(10, 100)
    assert(10 <= i2 && i2 <= 100)

    Crypto.randomInt(
      10,
      (_, i3) => {
        assert(0 <= i3 && i3 <= 10)
      }
    )

    Crypto.randomInt(
      10,
      100,
      (_, i4) => {
        assert(10 <= i4 && i4 <= 100)
      }
    )
  }
}
