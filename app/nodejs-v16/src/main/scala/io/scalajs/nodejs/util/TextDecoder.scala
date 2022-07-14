package io.scalajs.nodejs.util

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{ArrayBuffer, ArrayBufferView}

@js.native
@JSImport("util", "TextDecoder")
class TextDecoder() extends js.Object {
  def this(encoding: String) = this()

  val encoding: String   = js.native
  val fatal: Boolean     = js.native
  val ignoreBOM: Boolean = js.native

  def decode(buffer: ArrayBuffer, options: TextDecodeOptions): String     = js.native
  def decode(buffer: ArrayBufferView, options: TextDecodeOptions): String = js.native
  def decode(buffer: ArrayBuffer): String                                 = js.native
  def decode(buffer: ArrayBufferView): String                             = js.native
}

trait TextDecodeOptions extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}
object TextDecodeOptions {
  def apply(
      stream: js.UndefOr[Boolean] = js.undefined
  ): TextDecodeOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    stream.foreach(_v => _obj$.updateDynamic("stream")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[TextDecodeOptions]
  }
}
