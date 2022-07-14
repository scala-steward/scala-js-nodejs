package io.scalajs.nodejs.dgram

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait Dgram extends js.Object {
  def createSocket(options: SocketOptions, callback: js.Function): Socket = js.native
  def createSocket(options: SocketOptions): Socket                        = js.native
  def createSocket(`type`: String, callback: js.Function): Socket         = js.native
  def createSocket(`type`: String): Socket                                = js.native
}

trait SocketOptions extends js.Object {
  var `type`: String

  var reuseAddr: js.UndefOr[Boolean]                = js.undefined
  var ipv6Only: js.UndefOr[Boolean]                 = js.undefined
  var recvBufferSize: js.UndefOr[Int]               = js.undefined
  var sendBufferSize: js.UndefOr[Int]               = js.undefined
  var lookup: js.UndefOr[js.Function1[String, Any]] = js.undefined
}
object SocketOptions {
  def apply(
      `type`: String,
      reuseAddr: js.UndefOr[Boolean] = js.undefined,
      ipv6Only: js.UndefOr[Boolean] = js.undefined,
      recvBufferSize: js.UndefOr[Int] = js.undefined,
      sendBufferSize: js.UndefOr[Int] = js.undefined,
      lookup: js.UndefOr[js.Function1[String, Any]] = js.undefined
  ): SocketOptions = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    reuseAddr.foreach(_v => _obj$.updateDynamic("reuseAddr")(_v.asInstanceOf[js.Any]))
    ipv6Only.foreach(_v => _obj$.updateDynamic("ipv6Only")(_v.asInstanceOf[js.Any]))
    recvBufferSize.foreach(_v => _obj$.updateDynamic("recvBufferSize")(_v.asInstanceOf[js.Any]))
    sendBufferSize.foreach(_v => _obj$.updateDynamic("sendBufferSize")(_v.asInstanceOf[js.Any]))
    lookup.foreach(_v => _obj$.updateDynamic("lookup")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SocketOptions]
  }
}

@js.native
@JSImport("dgram", JSImport.Namespace)
object Dgram extends Dgram
