package io.scalajs.nodejs.https

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.tls

import scala.scalajs.js
import scala.scalajs.js.|

trait AgentOptions extends js.Object {
  var keepAlive: js.UndefOr[Boolean]                                       = js.undefined
  var keepAliveMsecs: js.UndefOr[Int]                                      = js.undefined
  var maxSockets: js.UndefOr[Double]                                       = js.undefined
  var maxFreeSockets: js.UndefOr[Int]                                      = js.undefined
  var timeout: js.UndefOr[Int]                                             = js.undefined
  var maxCachedSessions: js.UndefOr[Int]                                   = js.undefined
  var servername: js.UndefOr[String]                                       = js.undefined
  var ca: js.UndefOr[tls.SecureData]                                       = js.undefined
  var cert: js.UndefOr[tls.SecureData]                                     = js.undefined
  var ciphers: js.UndefOr[String]                                          = js.undefined
  var clientCertEngine: js.UndefOr[String]                                 = js.undefined
  var crl: js.UndefOr[tls.SecureData]                                      = js.undefined
  var dphram: js.UndefOr[String | Buffer]                                  = js.undefined
  var ecdhCurve: js.UndefOr[String]                                        = js.undefined
  var honorCihperOrder: js.UndefOr[Boolean]                                = js.undefined
  var key: js.UndefOr[tls.SecureData]                                      = js.undefined
  var passphrase: js.UndefOr[String]                                       = js.undefined
  var pfx: js.UndefOr[tls.SecureData | js.Array[tls.SecureDataObjectForm]] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean]                              = js.undefined
  var secureOptions: js.UndefOr[Int]                                       = js.undefined
  var secureProtocol: js.UndefOr[String]                                   = js.undefined
  var sessionIdContext: js.UndefOr[String]                                 = js.undefined
}

object AgentOptions {
  def apply(
      keepAlive: js.UndefOr[Boolean] = js.undefined,
      keepAliveMsecs: js.UndefOr[Int] = js.undefined,
      maxSockets: js.UndefOr[Double] = js.undefined,
      maxFreeSockets: js.UndefOr[Int] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      maxCachedSessions: js.UndefOr[Int] = js.undefined,
      servername: js.UndefOr[String] = js.undefined,
      ca: js.UndefOr[tls.SecureData] = js.undefined,
      cert: js.UndefOr[tls.SecureData] = js.undefined,
      ciphers: js.UndefOr[String] = js.undefined,
      clientCertEngine: js.UndefOr[String] = js.undefined,
      crl: js.UndefOr[tls.SecureData] = js.undefined,
      dphram: js.UndefOr[String | Buffer] = js.undefined,
      ecdhCurve: js.UndefOr[String] = js.undefined,
      honorCihperOrder: js.UndefOr[Boolean] = js.undefined,
      key: js.UndefOr[tls.SecureData] = js.undefined,
      passphrase: js.UndefOr[String] = js.undefined,
      pfx: js.UndefOr[tls.SecureData | js.Array[tls.SecureDataObjectForm]] = js.undefined,
      rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
      secureOptions: js.UndefOr[Int] = js.undefined,
      secureProtocol: js.UndefOr[String] = js.undefined,
      sessionIdContext: js.UndefOr[String] = js.undefined
  ): AgentOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    keepAlive.foreach(_v => _obj$.updateDynamic("keepAlive")(_v.asInstanceOf[js.Any]))
    keepAliveMsecs.foreach(_v => _obj$.updateDynamic("keepAliveMsecs")(_v.asInstanceOf[js.Any]))
    maxSockets.foreach(_v => _obj$.updateDynamic("maxSockets")(_v.asInstanceOf[js.Any]))
    maxFreeSockets.foreach(_v => _obj$.updateDynamic("maxFreeSockets")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    maxCachedSessions.foreach(_v => _obj$.updateDynamic("maxCachedSessions")(_v.asInstanceOf[js.Any]))
    servername.foreach(_v => _obj$.updateDynamic("servername")(_v.asInstanceOf[js.Any]))
    ca.foreach(_v => _obj$.updateDynamic("ca")(_v.asInstanceOf[js.Any]))
    cert.foreach(_v => _obj$.updateDynamic("cert")(_v.asInstanceOf[js.Any]))
    ciphers.foreach(_v => _obj$.updateDynamic("ciphers")(_v.asInstanceOf[js.Any]))
    clientCertEngine.foreach(_v => _obj$.updateDynamic("clientCertEngine")(_v.asInstanceOf[js.Any]))
    crl.foreach(_v => _obj$.updateDynamic("crl")(_v.asInstanceOf[js.Any]))
    dphram.foreach(_v => _obj$.updateDynamic("dphram")(_v.asInstanceOf[js.Any]))
    ecdhCurve.foreach(_v => _obj$.updateDynamic("ecdhCurve")(_v.asInstanceOf[js.Any]))
    honorCihperOrder.foreach(_v => _obj$.updateDynamic("honorCihperOrder")(_v.asInstanceOf[js.Any]))
    key.foreach(_v => _obj$.updateDynamic("key")(_v.asInstanceOf[js.Any]))
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    pfx.foreach(_v => _obj$.updateDynamic("pfx")(_v.asInstanceOf[js.Any]))
    rejectUnauthorized.foreach(_v => _obj$.updateDynamic("rejectUnauthorized")(_v.asInstanceOf[js.Any]))
    secureOptions.foreach(_v => _obj$.updateDynamic("secureOptions")(_v.asInstanceOf[js.Any]))
    secureProtocol.foreach(_v => _obj$.updateDynamic("secureProtocol")(_v.asInstanceOf[js.Any]))
    sessionIdContext.foreach(_v => _obj$.updateDynamic("sessionIdContext")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[AgentOptions]
  }
}
