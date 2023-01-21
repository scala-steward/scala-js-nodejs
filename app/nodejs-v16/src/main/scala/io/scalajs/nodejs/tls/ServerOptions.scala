package io.scalajs.nodejs.tls

import io.scalajs.nodejs.buffer.Buffer

import scala.scalajs.js
import scala.scalajs.js.typedarray.{DataView, TypedArray}
import scala.scalajs.js.|

trait ServerOptions extends js.Object {
  var ALPNProtocols: js.UndefOr[
    js.Array[String] | js.Array[TypedArray[_, _]] | js.Array[DataView] | TypedArray[_, _] | DataView
  ] = js.undefined
  var enableTrace: js.UndefOr[Boolean]        = js.undefined
  var handshakeTimeout: js.UndefOr[Int]       = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var requestCert: js.UndefOr[Boolean]        = js.undefined
  var sessionTimeout: js.UndefOr[Int]         = js.undefined
  var SNICallback: js.UndefOr[js.Function2[String, js.Function2[io.scalajs.nodejs.Error, SecureContext, Any], Any]] =
    js.undefined
  var ticketKeys: js.UndefOr[Buffer] = js.undefined
  // Options for net.createServers
  var allowHalfOpen: js.UndefOr[Boolean]  = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  // Options for tls.createSecureContext
  var ca: js.UndefOr[SecureData]                                   = js.undefined
  var cert: js.UndefOr[SecureData]                                 = js.undefined
  var sigalgs: js.UndefOr[String]                                  = js.undefined
  var ciphers: js.UndefOr[String]                                  = js.undefined
  var clientCertEngine: js.UndefOr[String]                         = js.undefined
  var crl: js.UndefOr[SecureData]                                  = js.undefined
  var dphram: js.UndefOr[String | Buffer]                          = js.undefined
  var ecdhCurve: js.UndefOr[String]                                = js.undefined
  var honorCipherOrder: js.UndefOr[Boolean]                        = js.undefined
  var key: js.UndefOr[SecureData]                                  = js.undefined
  var maxVersion: js.UndefOr[String]                               = js.undefined
  var minVersion: js.UndefOr[String]                               = js.undefined
  var passphrase: js.UndefOr[String]                               = js.undefined
  var pfx: js.UndefOr[SecureData | js.Array[SecureDataObjectForm]] = js.undefined
  var secureOptions: js.UndefOr[Int]                               = js.undefined
  var secureProtocol: js.UndefOr[String]                           = js.undefined
  var sessionIdContext: js.UndefOr[String]                         = js.undefined
}

object ServerOptions {

  def apply(
      ALPNProtocols: js.UndefOr[
        js.Array[String] | js.Array[TypedArray[_, _]] | js.Array[DataView] | TypedArray[_, _] | DataView
      ] = js.undefined,
      enableTrace: js.UndefOr[Boolean] = js.undefined,
      handshakeTimeout: js.UndefOr[Int] = js.undefined,
      rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
      requestCert: js.UndefOr[Boolean] = js.undefined,
      sessionTimeout: js.UndefOr[Int] = js.undefined,
      SNICallback: js.UndefOr[js.Function2[String, js.Function2[io.scalajs.nodejs.Error, SecureContext, Any], Any]] =
        js.undefined,
      ticketKeys: js.UndefOr[Buffer] = js.undefined,
      allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
      pauseOnConnect: js.UndefOr[Boolean] = js.undefined,
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
      sessionIdContext: js.UndefOr[String] = js.undefined
  ): ServerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    ALPNProtocols.foreach(_v => _obj$.updateDynamic("ALPNProtocols")(_v.asInstanceOf[js.Any]))
    enableTrace.foreach(_v => _obj$.updateDynamic("enableTrace")(_v.asInstanceOf[js.Any]))
    handshakeTimeout.foreach(_v => _obj$.updateDynamic("handshakeTimeout")(_v.asInstanceOf[js.Any]))
    rejectUnauthorized.foreach(_v => _obj$.updateDynamic("rejectUnauthorized")(_v.asInstanceOf[js.Any]))
    requestCert.foreach(_v => _obj$.updateDynamic("requestCert")(_v.asInstanceOf[js.Any]))
    sessionTimeout.foreach(_v => _obj$.updateDynamic("sessionTimeout")(_v.asInstanceOf[js.Any]))
    SNICallback.foreach(_v => _obj$.updateDynamic("SNICallback")(_v.asInstanceOf[js.Any]))
    ticketKeys.foreach(_v => _obj$.updateDynamic("ticketKeys")(_v.asInstanceOf[js.Any]))
    allowHalfOpen.foreach(_v => _obj$.updateDynamic("allowHalfOpen")(_v.asInstanceOf[js.Any]))
    pauseOnConnect.foreach(_v => _obj$.updateDynamic("pauseOnConnect")(_v.asInstanceOf[js.Any]))
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
    _obj$.asInstanceOf[ServerOptions]
  }
}
