package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2RequestOptions extends js.Object {
  var endStream: js.UndefOr[Boolean]       = js.undefined
  var exclusive: js.UndefOr[Boolean]       = js.undefined
  var parent: js.UndefOr[Int]              = js.undefined
  var weight: js.UndefOr[Int]              = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}
object Http2RequestOptions {
  def apply(
      endStream: js.UndefOr[Boolean] = js.undefined,
      exclusive: js.UndefOr[Boolean] = js.undefined,
      parent: js.UndefOr[Int] = js.undefined,
      weight: js.UndefOr[Int] = js.undefined,
      waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): Http2RequestOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    endStream.foreach(_v => _obj$.updateDynamic("endStream")(_v.asInstanceOf[js.Any]))
    exclusive.foreach(_v => _obj$.updateDynamic("exclusive")(_v.asInstanceOf[js.Any]))
    parent.foreach(_v => _obj$.updateDynamic("parent")(_v.asInstanceOf[js.Any]))
    weight.foreach(_v => _obj$.updateDynamic("weight")(_v.asInstanceOf[js.Any]))
    waitForTrailers.foreach(_v => _obj$.updateDynamic("waitForTrailers")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2RequestOptions]
  }
}
