package io.scalajs.nodejs
package https

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** This class is a subclass of tls.Server and emits events same as http.Server. See http.Server for more information.
  */
@js.native
@JSImport("https", "Server")
class Server extends tls.Server {
  def headersTimeout: Int = js.native

  def maxHeaderCount: Int   = js.native
  def timeout: Int          = js.native
  def keepAliveTimeout: Int = js.native
}
