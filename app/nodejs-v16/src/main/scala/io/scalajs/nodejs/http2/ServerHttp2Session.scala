package io.scalajs.nodejs.http2

import scala.scalajs.js

@js.native
trait ServerHttp2Session extends Http2Session {
  def altsvc(alt: String, stream: Int): Unit    = js.native
  def altsvc(alt: String, origin: Origin): Unit = js.native

  def origin(origins: Origin*): Unit = js.native
}
