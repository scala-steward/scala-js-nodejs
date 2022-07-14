package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2ResponseOptions extends js.Object {
  var endStream: js.UndefOr[Boolean]       = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}

object Http2ResponseOptions {
  def apply(
      endStream: js.UndefOr[Boolean] = js.undefined,
      waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): Http2ResponseOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    endStream.foreach(_v => _obj$.updateDynamic("endStream")(_v.asInstanceOf[js.Any]))
    waitForTrailers.foreach(_v => _obj$.updateDynamic("waitForTrailers")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2ResponseOptions]
  }
}
