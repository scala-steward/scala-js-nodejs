package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2Priority extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[Int]        = js.undefined
  var weight: js.UndefOr[Int]        = js.undefined
  var silent: js.UndefOr[Boolean]    = js.undefined
}
object Http2Priority {
  def apply(
      exclusive: js.UndefOr[Boolean] = js.undefined,
      parent: js.UndefOr[Int] = js.undefined,
      weight: js.UndefOr[Int] = js.undefined,
      silent: js.UndefOr[Boolean] = js.undefined
  ): Http2Priority = {
    val _obj$ = js.Dynamic.literal(
    )
    exclusive.foreach(_v => _obj$.updateDynamic("exclusive")(_v.asInstanceOf[js.Any]))
    parent.foreach(_v => _obj$.updateDynamic("parent")(_v.asInstanceOf[js.Any]))
    weight.foreach(_v => _obj$.updateDynamic("weight")(_v.asInstanceOf[js.Any]))
    silent.foreach(_v => _obj$.updateDynamic("silent")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2Priority]
  }
}
