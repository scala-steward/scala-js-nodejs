package io.scalajs.nodejs.http2

import scala.scalajs.js

trait Http2Settings extends js.Object {
  var headerTableSize: js.UndefOr[Int]       = js.undefined
  var enablePush: js.UndefOr[Boolean]        = js.undefined
  var initialWindowSize: js.UndefOr[Int]     = js.undefined
  var maxFrameSize: js.UndefOr[Int]          = js.undefined
  var maxConcurrentStreams: js.UndefOr[Int]  = js.undefined
  var maxHeaderListSize: js.UndefOr[Int]     = js.undefined
  var enableConnectProtocol: js.UndefOr[Int] = js.undefined
}

object Http2Settings {
  def apply(
      headerTableSize: js.UndefOr[Int] = js.undefined,
      enablePush: js.UndefOr[Boolean] = js.undefined,
      initialWindowSize: js.UndefOr[Int] = js.undefined,
      maxFrameSize: js.UndefOr[Int] = js.undefined,
      maxConcurrentStreams: js.UndefOr[Int] = js.undefined,
      maxHeaderListSize: js.UndefOr[Int] = js.undefined,
      enableConnectProtocol: js.UndefOr[Int] = js.undefined
  ): Http2Settings = {
    val _obj$ = js.Dynamic.literal(
    )
    headerTableSize.foreach(_v => _obj$.updateDynamic("headerTableSize")(_v.asInstanceOf[js.Any]))
    enablePush.foreach(_v => _obj$.updateDynamic("enablePush")(_v.asInstanceOf[js.Any]))
    initialWindowSize.foreach(_v => _obj$.updateDynamic("initialWindowSize")(_v.asInstanceOf[js.Any]))
    maxFrameSize.foreach(_v => _obj$.updateDynamic("maxFrameSize")(_v.asInstanceOf[js.Any]))
    maxConcurrentStreams.foreach(_v => _obj$.updateDynamic("maxConcurrentStreams")(_v.asInstanceOf[js.Any]))
    maxHeaderListSize.foreach(_v => _obj$.updateDynamic("maxHeaderListSize")(_v.asInstanceOf[js.Any]))
    enableConnectProtocol.foreach(_v => _obj$.updateDynamic("enableConnectProtocol")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2Settings]
  }
}
