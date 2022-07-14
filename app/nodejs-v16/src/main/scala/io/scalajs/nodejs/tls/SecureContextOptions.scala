package io.scalajs.nodejs.tls

import com.thoughtworks.enableIf
import io.scalajs.nodejs.buffer.Buffer

import scala.scalajs.js
import scala.scalajs.js.|

trait SecureContextOptions extends js.Object {
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

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var ticketKeys: js.UndefOr[Buffer] = js.undefined
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var sessionTimeout: js.UndefOr[Double] = js.undefined
}

object SecureContextOptions {
  def apply(
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
      sessionTimeout: js.UndefOr[Double] = js.undefined
  ): SecureContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
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
    _obj$.asInstanceOf[SecureContextOptions]
  }
}
