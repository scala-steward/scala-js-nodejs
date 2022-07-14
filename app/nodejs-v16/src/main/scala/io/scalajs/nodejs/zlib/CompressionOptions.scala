package io.scalajs.nodejs.zlib

import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, DataView, TypedArray}
import scala.scalajs.js.|

trait CompressionOptions extends js.Object {
  var flush: js.UndefOr[CompressionFlush] = js.undefined

  var finishFlush: js.UndefOr[CompressionFlush] = js.undefined

  var chunkSize: js.UndefOr[Int] = js.undefined

  var windowBits: js.UndefOr[Int] = js.undefined

  /** (compression only)
    */
  var level: js.UndefOr[CompressionLevel] = js.undefined

  /** (compression only)
    */
  var memLevel: js.UndefOr[CompressionLevel] = js.undefined

  /** (compression only)
    */
  var strategy: js.UndefOr[CompressionStrategy] = js.undefined

  /** deflate/inflate only, empty dictionary by default
    */
  var dictionary: js.UndefOr[TypedArray[_, _] | DataView | ArrayBuffer] = js.undefined

  var info: js.UndefOr[Boolean] = js.undefined
}

object CompressionOptions {
  def apply(
      flush: js.UndefOr[CompressionFlush] = js.undefined,
      finishFlush: js.UndefOr[CompressionFlush] = js.undefined,
      chunkSize: js.UndefOr[Int] = js.undefined,
      windowBits: js.UndefOr[Int] = js.undefined,
      level: js.UndefOr[CompressionLevel] = js.undefined,
      memLevel: js.UndefOr[CompressionLevel] = js.undefined,
      strategy: js.UndefOr[CompressionStrategy] = js.undefined,
      dictionary: js.UndefOr[TypedArray[_, _] | DataView | ArrayBuffer] = js.undefined,
      info: js.UndefOr[Boolean] = js.undefined
  ): CompressionOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    flush.foreach(_v => _obj$.updateDynamic("flush")(_v.asInstanceOf[js.Any]))
    finishFlush.foreach(_v => _obj$.updateDynamic("finishFlush")(_v.asInstanceOf[js.Any]))
    chunkSize.foreach(_v => _obj$.updateDynamic("chunkSize")(_v.asInstanceOf[js.Any]))
    windowBits.foreach(_v => _obj$.updateDynamic("windowBits")(_v.asInstanceOf[js.Any]))
    level.foreach(_v => _obj$.updateDynamic("level")(_v.asInstanceOf[js.Any]))
    memLevel.foreach(_v => _obj$.updateDynamic("memLevel")(_v.asInstanceOf[js.Any]))
    strategy.foreach(_v => _obj$.updateDynamic("strategy")(_v.asInstanceOf[js.Any]))
    dictionary.foreach(_v => _obj$.updateDynamic("dictionary")(_v.asInstanceOf[js.Any]))
    info.foreach(_v => _obj$.updateDynamic("info")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CompressionOptions]
  }
}
