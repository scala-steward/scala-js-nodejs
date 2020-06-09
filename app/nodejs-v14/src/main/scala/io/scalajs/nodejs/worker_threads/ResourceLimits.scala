package io.scalajs.nodejs.worker_threads

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait ResourceLimits extends js.Object {
  var maxYoungGenerationSizeMb: js.UndefOr[Int] = js.undefined
  var maxOldGenerationSizeMb: js.UndefOr[Int]   = js.undefined
  var codeRangeSizeMb: js.UndefOr[Int]          = js.undefined
  var stackSizeMb: js.UndefOr[Int]              = js.undefined
}
