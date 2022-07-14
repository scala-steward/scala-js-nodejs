package io.scalajs.nodejs.console_module

import scala.scalajs.js

trait ConsoleDirOptions extends js.Object {

  /** if true then the object's non-enumerable and symbol properties will be shown too. Defaults to `false`.
    */
  var showHidden: js.UndefOr[Boolean] = js.undefined

  /** tells util.inspect() how many times to recurse while formatting the object. This is useful for inspecting large
    * complicated objects. Defaults to `2`. To make it recurse indefinitely, pass null.
    */
  var depth: js.UndefOr[Int] = js.undefined

  /** if true, then the output will be styled with ANSI color codes. Defaults to `false`. Colors are customizable;see
    * customizing util.inspect() colors.
    */
  var colors: js.UndefOr[Boolean] = js.undefined
}

object ConsoleDirOptions {
  def apply(
      showHidden: js.UndefOr[Boolean] = js.undefined,
      depth: js.UndefOr[Int] = js.undefined,
      colors: js.UndefOr[Boolean] = js.undefined
  ): ConsoleDirOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    showHidden.foreach(_v => _obj$.updateDynamic("showHidden")(_v.asInstanceOf[js.Any]))
    depth.foreach(_v => _obj$.updateDynamic("depth")(_v.asInstanceOf[js.Any]))
    colors.foreach(_v => _obj$.updateDynamic("colors")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ConsoleDirOptions]
  }
}
