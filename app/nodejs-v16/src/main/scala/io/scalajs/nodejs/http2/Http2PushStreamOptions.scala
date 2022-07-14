package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2PushStreamOptions extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[Int]        = js.undefined
}

object Http2PushStreamOptions {
  def apply(
      exclusive: js.UndefOr[Boolean] = js.undefined,
      parent: js.UndefOr[Int] = js.undefined
  ): Http2PushStreamOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    exclusive.foreach(_v => _obj$.updateDynamic("exclusive")(_v.asInstanceOf[js.Any]))
    parent.foreach(_v => _obj$.updateDynamic("parent")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2PushStreamOptions]
  }
}
