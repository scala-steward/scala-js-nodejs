package io.scalajs.nodejs.http

import scala.scalajs.js

trait GetNameOptions extends js.Object {
  var host: String
  var port: js.UndefOr[Int]            = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[Int]          = js.undefined
}

object GetNameOptions {
  def apply(
      host: String,
      port: js.UndefOr[Int] = js.undefined,
      localAddress: js.UndefOr[String] = js.undefined,
      family: js.UndefOr[Int] = js.undefined
  ): GetNameOptions = {
    val _obj$ = js.Dynamic.literal(
      "host" -> host.asInstanceOf[js.Any]
    )
    port.foreach(_v => _obj$.updateDynamic("port")(_v.asInstanceOf[js.Any]))
    localAddress.foreach(_v => _obj$.updateDynamic("localAddress")(_v.asInstanceOf[js.Any]))
    family.foreach(_v => _obj$.updateDynamic("family")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[GetNameOptions]
  }
}
