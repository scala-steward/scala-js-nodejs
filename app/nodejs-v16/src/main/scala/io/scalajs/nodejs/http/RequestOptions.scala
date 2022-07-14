package io.scalajs.nodejs.http

import com.thoughtworks.enableIf
import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.tls

import scala.scalajs.js
import scala.scalajs.js.|

trait RequestOptions extends js.Object {
  var agent: js.UndefOr[Agent | Boolean]                                   = js.undefined
  var auth: js.UndefOr[String]                                             = js.undefined
  var createConnection: js.UndefOr[js.Function]                            = js.undefined
  var defaultPort: js.UndefOr[Int]                                         = js.undefined
  var family: js.UndefOr[Int]                                              = js.undefined
  var headers: js.UndefOr[js.Dictionary[js.Any]]                           = js.undefined
  var host: js.UndefOr[String]                                             = js.undefined
  var hostname: js.UndefOr[String]                                         = js.undefined
  var localAddress: js.UndefOr[String]                                     = js.undefined
  var method: js.UndefOr[String]                                           = js.undefined
  var path: js.UndefOr[String]                                             = js.undefined
  var port: js.UndefOr[Int]                                                = js.undefined
  var protocol: js.UndefOr[String]                                         = js.undefined
  var setHost: js.UndefOr[Boolean]                                         = js.undefined
  var socketPath: js.UndefOr[String]                                       = js.undefined
  var timeout: js.UndefOr[Int]                                             = js.undefined
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
  var insecureHTTPParser: js.UndefOr[Int]                                  = js.undefined
  var highWaterMark: js.UndefOr[Int]                                       = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var maxHeaderSize: js.UndefOr[Int] = js.undefined
}

object RequestOptions {
  def apply(
      agent: js.UndefOr[Agent | Boolean] = js.undefined,
      auth: js.UndefOr[String] = js.undefined,
      createConnection: js.UndefOr[js.Function] = js.undefined,
      defaultPort: js.UndefOr[Int] = js.undefined,
      family: js.UndefOr[Int] = js.undefined,
      headers: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
      host: js.UndefOr[String] = js.undefined,
      hostname: js.UndefOr[String] = js.undefined,
      localAddress: js.UndefOr[String] = js.undefined,
      method: js.UndefOr[String] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      port: js.UndefOr[Int] = js.undefined,
      protocol: js.UndefOr[String] = js.undefined,
      setHost: js.UndefOr[Boolean] = js.undefined,
      socketPath: js.UndefOr[String] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
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
      sessionIdContext: js.UndefOr[String] = js.undefined,
      insecureHTTPParser: js.UndefOr[Int] = js.undefined,
      highWaterMark: js.UndefOr[Int] = js.undefined,
      maxHeaderSize: js.UndefOr[Int] = js.undefined
  ): RequestOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    agent.foreach(_v => _obj$.updateDynamic("agent")(_v.asInstanceOf[js.Any]))
    auth.foreach(_v => _obj$.updateDynamic("auth")(_v.asInstanceOf[js.Any]))
    createConnection.foreach(_v => _obj$.updateDynamic("createConnection")(_v.asInstanceOf[js.Any]))
    defaultPort.foreach(_v => _obj$.updateDynamic("defaultPort")(_v.asInstanceOf[js.Any]))
    family.foreach(_v => _obj$.updateDynamic("family")(_v.asInstanceOf[js.Any]))
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    host.foreach(_v => _obj$.updateDynamic("host")(_v.asInstanceOf[js.Any]))
    hostname.foreach(_v => _obj$.updateDynamic("hostname")(_v.asInstanceOf[js.Any]))
    localAddress.foreach(_v => _obj$.updateDynamic("localAddress")(_v.asInstanceOf[js.Any]))
    method.foreach(_v => _obj$.updateDynamic("method")(_v.asInstanceOf[js.Any]))
    path.foreach(_v => _obj$.updateDynamic("path")(_v.asInstanceOf[js.Any]))
    port.foreach(_v => _obj$.updateDynamic("port")(_v.asInstanceOf[js.Any]))
    protocol.foreach(_v => _obj$.updateDynamic("protocol")(_v.asInstanceOf[js.Any]))
    setHost.foreach(_v => _obj$.updateDynamic("setHost")(_v.asInstanceOf[js.Any]))
    socketPath.foreach(_v => _obj$.updateDynamic("socketPath")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
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
    insecureHTTPParser.foreach(_v => _obj$.updateDynamic("insecureHTTPParser")(_v.asInstanceOf[js.Any]))
    highWaterMark.foreach(_v => _obj$.updateDynamic("highWaterMark")(_v.asInstanceOf[js.Any]))
    maxHeaderSize.foreach(_v => _obj$.updateDynamic("maxHeaderSize")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RequestOptions]
  }
}
