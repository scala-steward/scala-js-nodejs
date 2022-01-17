package io.scalajs.nodejs.http

import scala.scalajs.js

trait AgentOptions extends js.Object {
  var keepAlive: js.UndefOr[Boolean]  = js.undefined
  var keepAliveMsecs: js.UndefOr[Int] = js.undefined
  var maxSockets: js.UndefOr[Double]  = js.undefined
  var maxFreeSockets: js.UndefOr[Int] = js.undefined
  var timeout: js.UndefOr[Int]        = js.undefined
}
object AgentOptions {
  def apply(
      keepAlive: js.UndefOr[Boolean] = js.undefined,
      keepAliveMsecs: js.UndefOr[Int] = js.undefined,
      maxSockets: js.UndefOr[Double] = js.undefined,
      maxFreeSockets: js.UndefOr[Int] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined
  ): AgentOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    keepAlive.foreach(_v => _obj$.updateDynamic("keepAlive")(_v.asInstanceOf[js.Any]))
    keepAliveMsecs.foreach(_v => _obj$.updateDynamic("keepAliveMsecs")(_v.asInstanceOf[js.Any]))
    maxSockets.foreach(_v => _obj$.updateDynamic("maxSockets")(_v.asInstanceOf[js.Any]))
    maxFreeSockets.foreach(_v => _obj$.updateDynamic("maxFreeSockets")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[AgentOptions]
  }
}
