package io.scalajs.nodejs.vm

import scala.scalajs.js

class SyntheticModule protected () extends js.Object {
  def this(exportNames: js.Array[String], evaluateCallback: js.Function, options: SyntheticModuleOptions) = this()
  def this(exportNames: js.Array[String], evaluateCallback: js.Function) = this()

}

trait SyntheticModuleOptions extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[Context]   = js.undefined
}
object SyntheticModuleOptions {
  def apply(
      identifier: js.UndefOr[String] = js.undefined,
      context: js.UndefOr[Context] = js.undefined
  ): SyntheticModuleOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    identifier.foreach(_v => _obj$.updateDynamic("identifier")(_v.asInstanceOf[js.Any]))
    context.foreach(_v => _obj$.updateDynamic("context")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SyntheticModuleOptions]
  }
}
