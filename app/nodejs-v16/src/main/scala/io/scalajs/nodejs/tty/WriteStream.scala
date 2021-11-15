package io.scalajs.nodejs.tty

import com.thoughtworks.enableIf
import io.scalajs.nodejs.FileDescriptor
import io.scalajs.nodejs.net

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** The tty.WriteStream class is a subclass of net.Socket that represents the writable side of a TTY. In normal
  * circumstances, process.stdout and process.stderr will be the only tty.WriteStream instances created for a Node.js
  * process and there should be no reason to create additional instances.
  * @see
  *   https://nodejs.org/api/tty.html
  * @since 0.5.8
  */
@js.native
@JSImport("tty", "WriteStream")
class WriteStream(fd: FileDescriptor) extends net.Socket {

  /** A number specifying the number of columns the TTY currently has. This property is updated whenever the 'resize'
    * event is emitted.
    *
    * @see
    *   [[WriteStreamExtensions.onResize]]
    * @since 0.7.7
    */
  def columns: Int = js.native

  def clearLine(dir: Int, callback: js.Function): Boolean = js.native
  def clearLine(dir: Int): Boolean                        = js.native

  def clearScreenDown(callback: js.Function): Boolean = js.native
  def clearScreenDown(): Boolean                      = js.native

  def cursorTo(x: Int): Boolean                                = js.native
  def cursorTo(x: Int, y: Int): Boolean                        = js.native
  def cursorTo(x: Int, y: Int, callback: js.Function): Boolean = js.native

  def getColorDepth(env: io.scalajs.nodejs.process.Environment): Int = js.native
  def getColorDepth(): Int                                           = js.native

  def getWindowSize(): js.Tuple2[Int, Int] = js.native

  def hasColors(count: Int, env: io.scalajs.nodejs.process.Environment): Boolean = js.native
  def hasColors(count: Int): Boolean                                             = js.native
  def hasColors(env: io.scalajs.nodejs.process.Environment): Boolean             = js.native
  def hasColors(): Boolean                                                       = js.native

  /** Indicates whether the stream is a TTY
    */
  def isTTY: Boolean = js.native

  /** A number specifying the number of rows the TTY currently has. This property is updated whenever the 'resize' event
    * is emitted.
    *
    * @see
    *   [[WriteStreamExtensions.onResize]]
    * @since 0.7.7
    */
  def rows: Int = js.native

  def moveCursor(dx: Int, dy: Int): Boolean                        = js.native
  def moveCursor(dx: Int, dy: Int, callback: js.Function): Boolean = js.native
}
