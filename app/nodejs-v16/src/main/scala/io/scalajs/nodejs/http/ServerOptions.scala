package io.scalajs.nodejs.http

import com.thoughtworks.enableIf

import scala.scalajs.js

trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[js.Function] = js.undefined
  var ServerResponse: js.UndefOr[js.Function]  = js.undefined
  var insecureHTTPParser: js.UndefOr[Boolean]  = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var maxHeaderSize: js.UndefOr[Int] = js.undefined
}

object ServerOptions {
  def apply(
      IncomingMessage: js.UndefOr[js.Function] = js.undefined,
      ServerResponse: js.UndefOr[js.Function] = js.undefined,
      insecureHTTPParser: js.UndefOr[Boolean] = js.undefined,
      maxHeaderSize: js.UndefOr[Int] = js.undefined
  ): ServerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    IncomingMessage.foreach(_v => _obj$.updateDynamic("IncomingMessage")(_v.asInstanceOf[js.Any]))
    ServerResponse.foreach(_v => _obj$.updateDynamic("ServerResponse")(_v.asInstanceOf[js.Any]))
    insecureHTTPParser.foreach(_v => _obj$.updateDynamic("insecureHTTPParser")(_v.asInstanceOf[js.Any]))
    maxHeaderSize.foreach(_v => _obj$.updateDynamic("maxHeaderSize")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ServerOptions]
  }
}
