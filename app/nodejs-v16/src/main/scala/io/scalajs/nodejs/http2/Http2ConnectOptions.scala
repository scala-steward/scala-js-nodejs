package io.scalajs.nodejs.http2

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.http.OnreadObject
import io.scalajs.nodejs.{net, stream}
import io.scalajs.nodejs.tls.{ALPNProtocols, SecureContext, TLSCertificate}
import io.scalajs.nodejs.url.URL

import scala.scalajs.js

trait Http2ConnectOptions extends js.Object {
  var maxDeflateDynamicTableSize: js.UndefOr[Int]            = js.undefined
  var maxSessionMemory: js.UndefOr[Int]                      = js.undefined
  var maxHeaderListPairs: js.UndefOr[Int]                    = js.undefined
  var maxOutstandingPings: js.UndefOr[Int]                   = js.undefined
  var maxSendHeaderBlockLength: js.UndefOr[Int]              = js.undefined
  var paddingStrategy: js.UndefOr[Int]                       = js.undefined
  var peerMaxConcurrentStreams: js.UndefOr[Int]              = js.undefined
  var selectPadding: js.UndefOr[js.Function2[Int, Int, Int]] = js.undefined
  var settings: js.UndefOr[Http2Settings]                    = js.undefined
  // specific to connect
  var maxReservedRemoteStreams: js.UndefOr[Int]                                            = js.undefined
  var createConnection: js.UndefOr[js.Function2[URL, Http2ConnectOptions, stream.IDuplex]] = js.undefined
  // From net.connect
  // for socket.connect(option)
  var port: js.UndefOr[Int]                         = js.undefined
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
  // From tls.connect
  var socket: js.UndefOr[stream.IDuplex]                                         = js.undefined
  var servername: js.UndefOr[String]                                             = js.undefined
  var checkServerIdentity: js.UndefOr[js.Function2[String, TLSCertificate, Any]] = js.undefined
  var minDHSize: js.UndefOr[Int]                                                 = js.undefined
  // TLSSocketOptions
  var enableTrace: js.UndefOr[Boolean]                                = js.undefined
  var isServer: js.UndefOr[Boolean]                                   = js.undefined
  var server: js.UndefOr[net.Server]                                  = js.undefined
  var requestCert: js.UndefOr[Boolean]                                = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean]                         = js.undefined
  var NPNProtocols: js.UndefOr[Boolean]                               = js.undefined
  var ALPNProtocols: js.UndefOr[ALPNProtocols]                        = js.undefined
  var SNICallback: js.UndefOr[js.Function2[String, js.Function, Any]] = js.undefined
  var session: js.UndefOr[Buffer]                                     = js.undefined
  var requestOCSP: js.UndefOr[Boolean]                                = js.undefined
  var secureContext: js.UndefOr[SecureContext]                        = js.undefined
}

object Http2ConnectOptions {

  def apply(
      maxDeflateDynamicTableSize: js.UndefOr[Int] = js.undefined,
      maxSessionMemory: js.UndefOr[Int] = js.undefined,
      maxHeaderListPairs: js.UndefOr[Int] = js.undefined,
      maxOutstandingPings: js.UndefOr[Int] = js.undefined,
      maxSendHeaderBlockLength: js.UndefOr[Int] = js.undefined,
      paddingStrategy: js.UndefOr[Int] = js.undefined,
      peerMaxConcurrentStreams: js.UndefOr[Int] = js.undefined,
      selectPadding: js.UndefOr[js.Function2[Int, Int, Int]] = js.undefined,
      settings: js.UndefOr[Http2Settings] = js.undefined,
      maxReservedRemoteStreams: js.UndefOr[Int] = js.undefined,
      createConnection: js.UndefOr[js.Function2[URL, Http2ConnectOptions, stream.IDuplex]] = js.undefined,
      port: js.UndefOr[Int] = js.undefined,
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
      writable: js.UndefOr[Int] = js.undefined,
      socket: js.UndefOr[stream.IDuplex] = js.undefined,
      servername: js.UndefOr[String] = js.undefined,
      checkServerIdentity: js.UndefOr[js.Function2[String, TLSCertificate, Any]] = js.undefined,
      minDHSize: js.UndefOr[Int] = js.undefined,
      enableTrace: js.UndefOr[Boolean] = js.undefined,
      isServer: js.UndefOr[Boolean] = js.undefined,
      server: js.UndefOr[net.Server] = js.undefined,
      requestCert: js.UndefOr[Boolean] = js.undefined,
      rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
      NPNProtocols: js.UndefOr[Boolean] = js.undefined,
      ALPNProtocols: js.UndefOr[ALPNProtocols] = js.undefined,
      SNICallback: js.UndefOr[js.Function2[String, js.Function, Any]] = js.undefined,
      session: js.UndefOr[Buffer] = js.undefined,
      requestOCSP: js.UndefOr[Boolean] = js.undefined,
      secureContext: js.UndefOr[SecureContext] = js.undefined
  ): Http2ConnectOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    maxDeflateDynamicTableSize.foreach(_v => _obj$.updateDynamic("maxDeflateDynamicTableSize")(_v.asInstanceOf[js.Any]))
    maxSessionMemory.foreach(_v => _obj$.updateDynamic("maxSessionMemory")(_v.asInstanceOf[js.Any]))
    maxHeaderListPairs.foreach(_v => _obj$.updateDynamic("maxHeaderListPairs")(_v.asInstanceOf[js.Any]))
    maxOutstandingPings.foreach(_v => _obj$.updateDynamic("maxOutstandingPings")(_v.asInstanceOf[js.Any]))
    maxSendHeaderBlockLength.foreach(_v => _obj$.updateDynamic("maxSendHeaderBlockLength")(_v.asInstanceOf[js.Any]))
    paddingStrategy.foreach(_v => _obj$.updateDynamic("paddingStrategy")(_v.asInstanceOf[js.Any]))
    peerMaxConcurrentStreams.foreach(_v => _obj$.updateDynamic("peerMaxConcurrentStreams")(_v.asInstanceOf[js.Any]))
    selectPadding.foreach(_v => _obj$.updateDynamic("selectPadding")(_v.asInstanceOf[js.Any]))
    settings.foreach(_v => _obj$.updateDynamic("settings")(_v.asInstanceOf[js.Any]))
    maxReservedRemoteStreams.foreach(_v => _obj$.updateDynamic("maxReservedRemoteStreams")(_v.asInstanceOf[js.Any]))
    createConnection.foreach(_v => _obj$.updateDynamic("createConnection")(_v.asInstanceOf[js.Any]))
    port.foreach(_v => _obj$.updateDynamic("port")(_v.asInstanceOf[js.Any]))
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
    socket.foreach(_v => _obj$.updateDynamic("socket")(_v.asInstanceOf[js.Any]))
    servername.foreach(_v => _obj$.updateDynamic("servername")(_v.asInstanceOf[js.Any]))
    checkServerIdentity.foreach(_v => _obj$.updateDynamic("checkServerIdentity")(_v.asInstanceOf[js.Any]))
    minDHSize.foreach(_v => _obj$.updateDynamic("minDHSize")(_v.asInstanceOf[js.Any]))
    enableTrace.foreach(_v => _obj$.updateDynamic("enableTrace")(_v.asInstanceOf[js.Any]))
    isServer.foreach(_v => _obj$.updateDynamic("isServer")(_v.asInstanceOf[js.Any]))
    server.foreach(_v => _obj$.updateDynamic("server")(_v.asInstanceOf[js.Any]))
    requestCert.foreach(_v => _obj$.updateDynamic("requestCert")(_v.asInstanceOf[js.Any]))
    rejectUnauthorized.foreach(_v => _obj$.updateDynamic("rejectUnauthorized")(_v.asInstanceOf[js.Any]))
    NPNProtocols.foreach(_v => _obj$.updateDynamic("NPNProtocols")(_v.asInstanceOf[js.Any]))
    ALPNProtocols.foreach(_v => _obj$.updateDynamic("ALPNProtocols")(_v.asInstanceOf[js.Any]))
    SNICallback.foreach(_v => _obj$.updateDynamic("SNICallback")(_v.asInstanceOf[js.Any]))
    session.foreach(_v => _obj$.updateDynamic("session")(_v.asInstanceOf[js.Any]))
    requestOCSP.foreach(_v => _obj$.updateDynamic("requestOCSP")(_v.asInstanceOf[js.Any]))
    secureContext.foreach(_v => _obj$.updateDynamic("secureContext")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[Http2ConnectOptions]
  }
}
