package io.scalajs.nodejs.crypto

import scala.scalajs.js

trait DiffieHellmanOptions extends js.Object {
  var privateKey: KeyObject
  var publicKey: KeyObject
}
object DiffieHellmanOptions {
  def apply(
      privateKey: KeyObject,
      publicKey: KeyObject
  ): DiffieHellmanOptions = {
    val _obj$ = js.Dynamic.literal(
      "privateKey" -> privateKey.asInstanceOf[js.Any],
      "publicKey"  -> publicKey.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DiffieHellmanOptions]
  }
}
