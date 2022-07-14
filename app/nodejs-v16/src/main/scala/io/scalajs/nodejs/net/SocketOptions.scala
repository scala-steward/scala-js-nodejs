package io.scalajs.nodejs.net

import io.scalajs.nodejs.FileDescriptor

import scala.scalajs.js

trait SocketOptions extends js.Object {

  /** fd allows you to specify the existing file descriptor of socket. Set readable and/or writable to true to allow
    * reads and/or writes on this socket (NOTE: Works only when fd is passed). About allowHalfOpen, refer to
    * createServer() and 'end' event.
    */
  var fd: js.UndefOr[FileDescriptor]     = js.undefined
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var readable: js.UndefOr[Boolean]      = js.undefined
  var writable: js.UndefOr[Boolean]      = js.undefined
}

object SocketOptions {
  def apply(
      fd: js.UndefOr[FileDescriptor] = js.undefined,
      allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
      readable: js.UndefOr[Boolean] = js.undefined,
      writable: js.UndefOr[Boolean] = js.undefined
  ): SocketOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    fd.foreach(_v => _obj$.updateDynamic("fd")(_v.asInstanceOf[js.Any]))
    allowHalfOpen.foreach(_v => _obj$.updateDynamic("allowHalfOpen")(_v.asInstanceOf[js.Any]))
    readable.foreach(_v => _obj$.updateDynamic("readable")(_v.asInstanceOf[js.Any]))
    writable.foreach(_v => _obj$.updateDynamic("writable")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SocketOptions]
  }
}
