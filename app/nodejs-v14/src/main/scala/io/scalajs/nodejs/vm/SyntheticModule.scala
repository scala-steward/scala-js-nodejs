package io.scalajs.nodejs.vm

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

class SyntheticModule protected () extends js.Object {
  def this(exportNames: js.Array[String], evaluateCallback: js.Function, options: SyntheticModuleOptions) = this()
  def this(exportNames: js.Array[String], evaluateCallback: js.Function) = this()

}

@Factory
trait SyntheticModuleOptions extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[Context]   = js.undefined
}
