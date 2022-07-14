package io.scalajs.nodejs.tls

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.{net, stream}
import com.thoughtworks.enableIf
import io.scalajs.nodejs.http.OnreadObject

import scala.scalajs.js
import scala.scalajs.js.|

trait ConnectOptions extends net.ConnectOptions with SecureContextOptions {
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

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var pskCallback: js.UndefOr[js.Function1[String, PSK]] = js.undefined
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var highWaterMark: js.UndefOr[Int] = js.undefined
}

object ConnectOptions {

  def apply(
      port: Int,
      host: js.UndefOr[String] = js.undefined,
      localAddress: js.UndefOr[String] = js.undefined,
      localPort: js.UndefOr[Int] = js.undefined,
      family: js.UndefOr[Int] = js.undefined,
      hints: js.UndefOr[Int] = js.undefined,
      lookup: js.UndefOr[js.Function1[String, Any]] = js.undefined,
      onread: js.UndefOr[OnreadObject] = js.undefined,
      ca: js.UndefOr[SecureData] = js.undefined,
      cert: js.UndefOr[SecureData] = js.undefined,
      sigalgs: js.UndefOr[String] = js.undefined,
      ciphers: js.UndefOr[String] = js.undefined,
      clientCertEngine: js.UndefOr[String] = js.undefined,
      crl: js.UndefOr[SecureData] = js.undefined,
      dphram: js.UndefOr[String | Buffer] = js.undefined,
      ecdhCurve: js.UndefOr[String] = js.undefined,
      honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
      key: js.UndefOr[SecureData] = js.undefined,
      maxVersion: js.UndefOr[String] = js.undefined,
      minVersion: js.UndefOr[String] = js.undefined,
      passphrase: js.UndefOr[String] = js.undefined,
      pfx: js.UndefOr[SecureData | js.Array[SecureDataObjectForm]] = js.undefined,
      secureOptions: js.UndefOr[Int] = js.undefined,
      secureProtocol: js.UndefOr[String] = js.undefined,
      sessionIdContext: js.UndefOr[String] = js.undefined,
      ticketKeys: js.UndefOr[Buffer] = js.undefined,
      sessionTimeout: js.UndefOr[Double] = js.undefined,
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
      secureContext: js.UndefOr[SecureContext] = js.undefined,
      pskCallback: js.UndefOr[js.Function1[String, PSK]] = js.undefined,
      highWaterMark: js.UndefOr[Int] = js.undefined
  ): ConnectOptions = {
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
    ca.foreach(_v => _obj$.updateDynamic("ca")(_v.asInstanceOf[js.Any]))
    cert.foreach(_v => _obj$.updateDynamic("cert")(_v.asInstanceOf[js.Any]))
    sigalgs.foreach(_v => _obj$.updateDynamic("sigalgs")(_v.asInstanceOf[js.Any]))
    ciphers.foreach(_v => _obj$.updateDynamic("ciphers")(_v.asInstanceOf[js.Any]))
    clientCertEngine.foreach(_v => _obj$.updateDynamic("clientCertEngine")(_v.asInstanceOf[js.Any]))
    crl.foreach(_v => _obj$.updateDynamic("crl")(_v.asInstanceOf[js.Any]))
    dphram.foreach(_v => _obj$.updateDynamic("dphram")(_v.asInstanceOf[js.Any]))
    ecdhCurve.foreach(_v => _obj$.updateDynamic("ecdhCurve")(_v.asInstanceOf[js.Any]))
    honorCipherOrder.foreach(_v => _obj$.updateDynamic("honorCipherOrder")(_v.asInstanceOf[js.Any]))
    key.foreach(_v => _obj$.updateDynamic("key")(_v.asInstanceOf[js.Any]))
    maxVersion.foreach(_v => _obj$.updateDynamic("maxVersion")(_v.asInstanceOf[js.Any]))
    minVersion.foreach(_v => _obj$.updateDynamic("minVersion")(_v.asInstanceOf[js.Any]))
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    pfx.foreach(_v => _obj$.updateDynamic("pfx")(_v.asInstanceOf[js.Any]))
    secureOptions.foreach(_v => _obj$.updateDynamic("secureOptions")(_v.asInstanceOf[js.Any]))
    secureProtocol.foreach(_v => _obj$.updateDynamic("secureProtocol")(_v.asInstanceOf[js.Any]))
    sessionIdContext.foreach(_v => _obj$.updateDynamic("sessionIdContext")(_v.asInstanceOf[js.Any]))
    ticketKeys.foreach(_v => _obj$.updateDynamic("ticketKeys")(_v.asInstanceOf[js.Any]))
    sessionTimeout.foreach(_v => _obj$.updateDynamic("sessionTimeout")(_v.asInstanceOf[js.Any]))
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
    pskCallback.foreach(_v => _obj$.updateDynamic("pskCallback")(_v.asInstanceOf[js.Any]))
    highWaterMark.foreach(_v => _obj$.updateDynamic("highWaterMark")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ConnectOptions]
  }
}

trait PSK extends js.Object {
  var psk: js.typedarray.TypedArray[_, _] | js.typedarray.DataView
  var identity: String
}
object PSK {
  def apply(
      psk: js.typedarray.TypedArray[_, _] | js.typedarray.DataView,
      identity: String
  ): PSK = {
    val _obj$ = js.Dynamic.literal(
      "psk"      -> psk.asInstanceOf[js.Any],
      "identity" -> identity.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PSK]
  }
}
