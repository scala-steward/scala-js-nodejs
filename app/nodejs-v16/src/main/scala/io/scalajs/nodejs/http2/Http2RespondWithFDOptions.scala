package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2RespondWithFDOptions extends js.Object {
  var statCheck: js.UndefOr[js.Function]   = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Int]              = js.undefined
  var length: js.UndefOr[Int]              = js.undefined
}
object Http2RespondWithFDOptions {
  def apply(
      statCheck: js.UndefOr[js.Function] = js.undefined,
      waitForTrailers: js.UndefOr[Boolean] = js.undefined,
      offset: js.UndefOr[Int] = js.undefined,
      length: js.UndefOr[Int] = js.undefined
  ): Http2RespondWithFDOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    statCheck.foreach(_v => _obj$.updateDynamic("statCheck")(_v.asInstanceOf[js.Any]))
    waitForTrailers.foreach(_v => _obj$.updateDynamic("waitForTrailers")(_v.asInstanceOf[js.Any]))
    offset.foreach(_v => _obj$.updateDynamic("offset")(_v.asInstanceOf[js.Any]))
    length.foreach(_v => _obj$.updateDynamic("length")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2RespondWithFDOptions]
  }
}
