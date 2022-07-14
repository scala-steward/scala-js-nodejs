package io.scalajs.nodejs.net

import scala.scalajs.js

trait ServerOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean]  = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}
object ServerOptions {
  def apply(
      allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
      pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  ): ServerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    allowHalfOpen.foreach(_v => _obj$.updateDynamic("allowHalfOpen")(_v.asInstanceOf[js.Any]))
    pauseOnConnect.foreach(_v => _obj$.updateDynamic("pauseOnConnect")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ServerOptions]
  }
}
