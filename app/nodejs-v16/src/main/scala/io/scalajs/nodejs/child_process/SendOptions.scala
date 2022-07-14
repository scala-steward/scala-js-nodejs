package io.scalajs.nodejs.child_process

import scala.scalajs.js

trait SendOptions extends js.Object {
  var keepOpen: js.UndefOr[Boolean] = js.undefined
}
object SendOptions {
  def apply(
      keepOpen: js.UndefOr[Boolean] = js.undefined
  ): SendOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    keepOpen.foreach(_v => _obj$.updateDynamic("keepOpen")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SendOptions]
  }
}
