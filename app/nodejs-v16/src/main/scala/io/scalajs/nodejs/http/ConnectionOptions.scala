package io.scalajs.nodejs.http

import scala.scalajs.js
import scala.scalajs.js.typedarray.Uint8Array
import scala.scalajs.js.|

trait ConnectionOptions extends js.Object {
  // for socket.connect(option)
  var port: Int
  var host: js.UndefOr[String]                      = js.undefined
  var localAddress: js.UndefOr[String]              = js.undefined
  var localPort: js.UndefOr[Int]                    = js.undefined
  var family: js.UndefOr[Int]                       = js.undefined
  var hints: js.UndefOr[Int]                        = js.undefined
  var lookup: js.UndefOr[js.Function1[String, Any]] = js.undefined
  var onread: js.UndefOr[OnreadObject]              = js.undefined

  // for IPC connections
  var path: js.UndefOr[String] = js.undefined

  // for new Socket(option)
  var fd: js.UndefOr[Int]                = js.undefined
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var readable: js.UndefOr[Boolean]      = js.undefined
  var writable: js.UndefOr[Int]          = js.undefined
}

object ConnectionOptions {
  def apply(
      port: Int,
      host: js.UndefOr[String] = js.undefined,
      localAddress: js.UndefOr[String] = js.undefined,
      localPort: js.UndefOr[Int] = js.undefined,
      family: js.UndefOr[Int] = js.undefined,
      hints: js.UndefOr[Int] = js.undefined,
      lookup: js.UndefOr[js.Function1[String, Any]] = js.undefined,
      onread: js.UndefOr[OnreadObject] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      fd: js.UndefOr[Int] = js.undefined,
      allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
      readable: js.UndefOr[Boolean] = js.undefined,
      writable: js.UndefOr[Int] = js.undefined
  ): ConnectionOptions = {
    val _obj$ = js.Dynamic.literal(
      "port" -> port.asInstanceOf[js.Any]
    )
    host.foreach(_v => _obj$.updateDynamic("host")(_v.asInstanceOf[js.Any]))
    localAddress.foreach(_v => _obj$.updateDynamic("localAddress")(_v.asInstanceOf[js.Any]))
    localPort.foreach(_v => _obj$.updateDynamic("localPort")(_v.asInstanceOf[js.Any]))
    family.foreach(_v => _obj$.updateDynamic("family")(_v.asInstanceOf[js.Any]))
    hints.foreach(_v => _obj$.updateDynamic("hints")(_v.asInstanceOf[js.Any]))
    lookup.foreach(_v => _obj$.updateDynamic("lookup")(_v.asInstanceOf[js.Any]))
    onread.foreach(_v => _obj$.updateDynamic("onread")(_v.asInstanceOf[js.Any]))
    path.foreach(_v => _obj$.updateDynamic("path")(_v.asInstanceOf[js.Any]))
    fd.foreach(_v => _obj$.updateDynamic("fd")(_v.asInstanceOf[js.Any]))
    allowHalfOpen.foreach(_v => _obj$.updateDynamic("allowHalfOpen")(_v.asInstanceOf[js.Any]))
    readable.foreach(_v => _obj$.updateDynamic("readable")(_v.asInstanceOf[js.Any]))
    writable.foreach(_v => _obj$.updateDynamic("writable")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ConnectionOptions]
  }
}

trait OnreadObject extends js.Object {
  var buffer: Uint8Array | js.Function0[Uint8Array]
  var callback: js.Function2[Int, Uint8Array, Boolean]
}

object OnreadObject {
  def apply(
      buffer: js.typedarray.Uint8Array | js.Function0[Uint8Array],
      callback: js.Function2[Int, Uint8Array, Boolean]
  ): OnreadObject = {
    val _obj$ = js.Dynamic.literal(
      "buffer"   -> buffer.asInstanceOf[js.Any],
      "callback" -> callback.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[OnreadObject]
  }
}
