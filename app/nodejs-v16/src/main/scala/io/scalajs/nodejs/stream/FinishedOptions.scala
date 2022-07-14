package io.scalajs.nodejs.stream

import scala.scalajs.js

trait FinishedOptions extends js.Object {
  var error: js.UndefOr[Boolean]    = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}
object FinishedOptions {
  def apply(
      error: js.UndefOr[Boolean] = js.undefined,
      readable: js.UndefOr[Boolean] = js.undefined,
      writable: js.UndefOr[Boolean] = js.undefined
  ): FinishedOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    error.foreach(_v => _obj$.updateDynamic("error")(_v.asInstanceOf[js.Any]))
    readable.foreach(_v => _obj$.updateDynamic("readable")(_v.asInstanceOf[js.Any]))
    writable.foreach(_v => _obj$.updateDynamic("writable")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[FinishedOptions]
  }
}
