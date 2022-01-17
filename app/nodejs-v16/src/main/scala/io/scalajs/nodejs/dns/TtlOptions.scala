package io.scalajs.nodejs.dns

import scala.scalajs.js

trait TtlOptions extends js.Object {
  var ttl: js.UndefOr[Boolean] = js.undefined
}
object TtlOptions {
  def apply(
      ttl: js.UndefOr[Boolean] = js.undefined
  ): TtlOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    ttl.foreach(_v => _obj$.updateDynamic("ttl")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[TtlOptions]
  }
}
