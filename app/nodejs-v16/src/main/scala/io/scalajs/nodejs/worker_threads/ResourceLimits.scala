package io.scalajs.nodejs.worker_threads

import scala.scalajs.js

trait ResourceLimits extends js.Object {
  var maxYoungGenerationSizeMb: js.UndefOr[Int] = js.undefined
  var maxOldGenerationSizeMb: js.UndefOr[Int]   = js.undefined
  var codeRangeSizeMb: js.UndefOr[Int]          = js.undefined
  var stackSizeMb: js.UndefOr[Int]              = js.undefined
}
object ResourceLimits {
  def apply(
      maxYoungGenerationSizeMb: js.UndefOr[Int] = js.undefined,
      maxOldGenerationSizeMb: js.UndefOr[Int] = js.undefined,
      codeRangeSizeMb: js.UndefOr[Int] = js.undefined,
      stackSizeMb: js.UndefOr[Int] = js.undefined
  ): ResourceLimits = {
    val _obj$ = js.Dynamic.literal(
    )
    maxYoungGenerationSizeMb.foreach(_v => _obj$.updateDynamic("maxYoungGenerationSizeMb")(_v.asInstanceOf[js.Any]))
    maxOldGenerationSizeMb.foreach(_v => _obj$.updateDynamic("maxOldGenerationSizeMb")(_v.asInstanceOf[js.Any]))
    codeRangeSizeMb.foreach(_v => _obj$.updateDynamic("codeRangeSizeMb")(_v.asInstanceOf[js.Any]))
    stackSizeMb.foreach(_v => _obj$.updateDynamic("stackSizeMb")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ResourceLimits]
  }
}
