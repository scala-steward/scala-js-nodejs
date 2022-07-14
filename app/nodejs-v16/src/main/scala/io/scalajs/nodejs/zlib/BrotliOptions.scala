package io.scalajs.nodejs.zlib

import scala.scalajs.js

trait BrotliOptions extends js.Object {
  var flush: js.UndefOr[Int]                    = js.undefined
  var finishFlush: js.UndefOr[Int]              = js.undefined
  var chunkSize: js.UndefOr[Int]                = js.undefined
  var params: js.UndefOr[js.Dictionary[js.Any]] = js.undefined
}
object BrotliOptions {
  def apply(
      flush: js.UndefOr[Int] = js.undefined,
      finishFlush: js.UndefOr[Int] = js.undefined,
      chunkSize: js.UndefOr[Int] = js.undefined,
      params: js.UndefOr[js.Any] = js.undefined
  ): BrotliOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    flush.foreach(_v => _obj$.updateDynamic("flush")(_v.asInstanceOf[js.Any]))
    finishFlush.foreach(_v => _obj$.updateDynamic("finishFlush")(_v.asInstanceOf[js.Any]))
    chunkSize.foreach(_v => _obj$.updateDynamic("chunkSize")(_v.asInstanceOf[js.Any]))
    params.foreach(_v => _obj$.updateDynamic("params")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[BrotliOptions]
  }
}
