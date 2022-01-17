package io.scalajs.nodejs.buffer

import com.thoughtworks.enableMembersIf
import io.scalajs.nodejs.webstream

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.typedarray.ArrayBuffer

@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
@JSImport("buffer", "Blob")
class Blob() extends js.Object {

  def this(source: BlobSources, options: BlobOptions) = this()
  def this(source: BlobSources) = this()

  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native

  def size: Double = js.native

  def slice(start: Double, end: Double, `type`: String): Blob = js.native
  def slice(start: Double, end: Double): Blob                 = js.native
  def slice(start: Double): Blob                              = js.native

  def text(): js.Promise[String] = js.native

  def `type`: String = js.native

  /** Alias for [[`type`]]
    */
  @JSName("type")
  def contentType: String = js.native

  def stream(): webstream.ReadableStream = js.native
}

trait BlobOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String]   = js.undefined
}
object BlobOptions {
  def apply(
      encoding: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined
  ): BlobOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    encoding.foreach(_v => _obj$.updateDynamic("encoding")(_v.asInstanceOf[js.Any]))
    `type`.foreach(_v => _obj$.updateDynamic("type")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[BlobOptions]
  }
}
