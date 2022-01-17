package io.scalajs.nodejs.net

import scala.scalajs.js

trait ListenerOptions extends js.Object {
  var host: js.UndefOr[String]         = js.undefined
  var port: js.UndefOr[Int]            = js.undefined
  var path: js.UndefOr[String]         = js.undefined
  var backlog: js.UndefOr[Int]         = js.undefined
  var exclusive: js.UndefOr[Boolean]   = js.undefined
  var readableAll: js.UndefOr[Boolean] = js.undefined
  var writableAll: js.UndefOr[Boolean] = js.undefined
  var ipv6Only: js.UndefOr[Boolean]    = js.undefined
}
object ListenerOptions {
  def apply(
      host: js.UndefOr[String] = js.undefined,
      port: js.UndefOr[Int] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      backlog: js.UndefOr[Int] = js.undefined,
      exclusive: js.UndefOr[Boolean] = js.undefined,
      readableAll: js.UndefOr[Boolean] = js.undefined,
      writableAll: js.UndefOr[Boolean] = js.undefined,
      ipv6Only: js.UndefOr[Boolean] = js.undefined
  ): ListenerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    host.foreach(_v => _obj$.updateDynamic("host")(_v.asInstanceOf[js.Any]))
    port.foreach(_v => _obj$.updateDynamic("port")(_v.asInstanceOf[js.Any]))
    path.foreach(_v => _obj$.updateDynamic("path")(_v.asInstanceOf[js.Any]))
    backlog.foreach(_v => _obj$.updateDynamic("backlog")(_v.asInstanceOf[js.Any]))
    exclusive.foreach(_v => _obj$.updateDynamic("exclusive")(_v.asInstanceOf[js.Any]))
    readableAll.foreach(_v => _obj$.updateDynamic("readableAll")(_v.asInstanceOf[js.Any]))
    writableAll.foreach(_v => _obj$.updateDynamic("writableAll")(_v.asInstanceOf[js.Any]))
    ipv6Only.foreach(_v => _obj$.updateDynamic("ipv6Only")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ListenerOptions]
  }
}
