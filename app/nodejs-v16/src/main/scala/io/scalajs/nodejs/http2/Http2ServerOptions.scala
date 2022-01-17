package io.scalajs.nodejs.http2

import com.thoughtworks.enableIf
import io.scalajs.nodejs.http

import scala.scalajs.js

trait Http2ServerOptions extends js.Object {
  var maxDeflateDynamicTableSize: js.UndefOr[Int]                               = js.undefined
  var maxSessionMemory: js.UndefOr[Int]                                         = js.undefined
  var maxHeaderListPairs: js.UndefOr[Int]                                       = js.undefined
  var maxOutstandingPings: js.UndefOr[Int]                                      = js.undefined
  var maxSendHeaderBlockLength: js.UndefOr[Int]                                 = js.undefined
  var paddingStrategy: js.UndefOr[Int]                                          = js.undefined
  var peerMaxConcurrentStreams: js.UndefOr[Int]                                 = js.undefined
  var settings: js.UndefOr[Http2Settings]                                       = js.undefined
  var Http1IncomingMessage: js.UndefOr[js.ConstructorTag[http.IncomingMessage]] = js.undefined
  var Http1ServerResponse: js.UndefOr[js.ConstructorTag[http.ServerResponse]]   = js.undefined
  var Http2ServerRequest: js.UndefOr[js.ConstructorTag[Http2ServerRequest]]     = js.undefined
  var Http2ServerResponse: js.UndefOr[js.ConstructorTag[Http2ServerResponse]]   = js.undefined
  var allowHalfOpen: js.UndefOr[Boolean]                                        = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean]                                       = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.ltNodeJs14)
  var selectPadding: js.UndefOr[js.Function2[Int, Int, Int]] = js.undefined
  var maxSessionRejectedStreams: js.UndefOr[Int]             = js.undefined
  var maxSessionInvalidFrames: js.UndefOr[Int]               = js.undefined
}

object Http2ServerOptions {

  def apply(
      maxDeflateDynamicTableSize: js.UndefOr[Int] = js.undefined,
      maxSessionMemory: js.UndefOr[Int] = js.undefined,
      maxHeaderListPairs: js.UndefOr[Int] = js.undefined,
      maxOutstandingPings: js.UndefOr[Int] = js.undefined,
      maxSendHeaderBlockLength: js.UndefOr[Int] = js.undefined,
      paddingStrategy: js.UndefOr[Int] = js.undefined,
      peerMaxConcurrentStreams: js.UndefOr[Int] = js.undefined,
      settings: js.UndefOr[Http2Settings] = js.undefined,
      Http1IncomingMessage: js.UndefOr[js.ConstructorTag[http.IncomingMessage]] = js.undefined,
      Http1ServerResponse: js.UndefOr[js.ConstructorTag[http.ServerResponse]] = js.undefined,
      Http2ServerRequest: js.UndefOr[js.ConstructorTag[Http2ServerRequest]] = js.undefined,
      Http2ServerResponse: js.UndefOr[js.ConstructorTag[Http2ServerResponse]] = js.undefined,
      allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
      pauseOnConnect: js.UndefOr[Boolean] = js.undefined,
      selectPadding: js.UndefOr[js.Function2[Int, Int, Int]] = js.undefined,
      maxSessionRejectedStreams: js.UndefOr[Int] = js.undefined,
      maxSessionInvalidFrames: js.UndefOr[Int] = js.undefined
  ): Http2ServerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    maxDeflateDynamicTableSize.foreach(_v => _obj$.updateDynamic("maxDeflateDynamicTableSize")(_v.asInstanceOf[js.Any]))
    maxSessionMemory.foreach(_v => _obj$.updateDynamic("maxSessionMemory")(_v.asInstanceOf[js.Any]))
    maxHeaderListPairs.foreach(_v => _obj$.updateDynamic("maxHeaderListPairs")(_v.asInstanceOf[js.Any]))
    maxOutstandingPings.foreach(_v => _obj$.updateDynamic("maxOutstandingPings")(_v.asInstanceOf[js.Any]))
    maxSendHeaderBlockLength.foreach(_v => _obj$.updateDynamic("maxSendHeaderBlockLength")(_v.asInstanceOf[js.Any]))
    paddingStrategy.foreach(_v => _obj$.updateDynamic("paddingStrategy")(_v.asInstanceOf[js.Any]))
    peerMaxConcurrentStreams.foreach(_v => _obj$.updateDynamic("peerMaxConcurrentStreams")(_v.asInstanceOf[js.Any]))
    settings.foreach(_v => _obj$.updateDynamic("settings")(_v.asInstanceOf[js.Any]))
    Http1IncomingMessage.foreach(_v => _obj$.updateDynamic("Http1IncomingMessage")(_v.asInstanceOf[js.Any]))
    Http1ServerResponse.foreach(_v => _obj$.updateDynamic("Http1ServerResponse")(_v.asInstanceOf[js.Any]))
    Http2ServerRequest.foreach(_v => _obj$.updateDynamic("Http2ServerRequest")(_v.asInstanceOf[js.Any]))
    Http2ServerResponse.foreach(_v => _obj$.updateDynamic("Http2ServerResponse")(_v.asInstanceOf[js.Any]))
    allowHalfOpen.foreach(_v => _obj$.updateDynamic("allowHalfOpen")(_v.asInstanceOf[js.Any]))
    pauseOnConnect.foreach(_v => _obj$.updateDynamic("pauseOnConnect")(_v.asInstanceOf[js.Any]))
    selectPadding.foreach(_v => _obj$.updateDynamic("selectPadding")(_v.asInstanceOf[js.Any]))
    maxSessionRejectedStreams.foreach(_v => _obj$.updateDynamic("maxSessionRejectedStreams")(_v.asInstanceOf[js.Any]))
    maxSessionInvalidFrames.foreach(_v => _obj$.updateDynamic("maxSessionInvalidFrames")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2ServerOptions]
  }
}
