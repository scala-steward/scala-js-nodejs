package io.scalajs.nodejs.util

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.|

/** @see
  *   [[https://nodejs.org/api/util.html#util_util_inspect_object_options]]
  */
trait InspectOptions extends js.Object {

  /** If true, the object's non-enumerable symbols and properties will be included in the formatted result. Defaults to
    * false.
    */
  var showHidden: js.UndefOr[Boolean] = js.undefined

  /** Specifies the number of times to recurse while formatting the object. This is useful for inspecting large
    * complicated objects. Defaults to 2. To make it recurse indefinitely pass null.
    */
  var depth: js.UndefOr[Int] = js.undefined

  /** If true, the output will be styled with ANSI color codes. Defaults to false. Colors are customizable, see
    * Customizing util.inspect colors.
    */
  var colors: js.UndefOr[Boolean] = js.undefined

  /** If false, then custom inspect(depth, opts) functions exported on the object being inspected will not be called.
    * Defaults to true.
    */
  var customInspect: js.UndefOr[Boolean] = js.undefined

  /** If true, then objects and functions that are Proxy objects will be introspected to show their target and handler
    * objects. Defaults to false.
    */
  var showProxy: js.UndefOr[Boolean] = js.undefined

  /** Specifies the maximum number of array and TypedArray elements to include when formatting. Defaults to 100. Set to
    * null to show all array elements. Set to 0 or negative to show no array elements.
    */
  var maxArrayLength: js.UndefOr[Int] = js.undefined

  /** The length at which an object's keys are split across multiple lines. Set to Infinity to format an object as a
    * single line. Defaults to 60 for legacy compatibility.
    */
  var breakLength: js.UndefOr[Int] = js.undefined

  var compact: js.UndefOr[Boolean | Int] = js.undefined

  var sorted: js.UndefOr[Boolean | js.Function2[String, String, Int]] = js.undefined

  var getters: js.UndefOr[Boolean | String] = js.undefined

  /** Fot Node.js v14.0.0+ Specifies the maximum number of characters to include when formatting. Set to null or
    * Infinity to show all elements.
    */
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var maxStringLength: js.UndefOr[Int] = js.undefined
}

object InspectOptions {
  def apply(
      showHidden: js.UndefOr[Boolean] = js.undefined,
      depth: js.UndefOr[Int] = js.undefined,
      colors: js.UndefOr[Boolean] = js.undefined,
      customInspect: js.UndefOr[Boolean] = js.undefined,
      showProxy: js.UndefOr[Boolean] = js.undefined,
      maxArrayLength: js.UndefOr[Int] = js.undefined,
      breakLength: js.UndefOr[Int] = js.undefined,
      compact: js.UndefOr[Boolean | Int] = js.undefined,
      sorted: js.UndefOr[Boolean | js.Function2[String, String, Int]] = js.undefined,
      getters: js.UndefOr[Boolean | String] = js.undefined,
      maxStringLength: js.UndefOr[Int] = js.undefined
  ): InspectOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    showHidden.foreach(_v => _obj$.updateDynamic("showHidden")(_v.asInstanceOf[js.Any]))
    depth.foreach(_v => _obj$.updateDynamic("depth")(_v.asInstanceOf[js.Any]))
    colors.foreach(_v => _obj$.updateDynamic("colors")(_v.asInstanceOf[js.Any]))
    customInspect.foreach(_v => _obj$.updateDynamic("customInspect")(_v.asInstanceOf[js.Any]))
    showProxy.foreach(_v => _obj$.updateDynamic("showProxy")(_v.asInstanceOf[js.Any]))
    maxArrayLength.foreach(_v => _obj$.updateDynamic("maxArrayLength")(_v.asInstanceOf[js.Any]))
    breakLength.foreach(_v => _obj$.updateDynamic("breakLength")(_v.asInstanceOf[js.Any]))
    compact.foreach(_v => _obj$.updateDynamic("compact")(_v.asInstanceOf[js.Any]))
    sorted.foreach(_v => _obj$.updateDynamic("sorted")(_v.asInstanceOf[js.Any]))
    getters.foreach(_v => _obj$.updateDynamic("getters")(_v.asInstanceOf[js.Any]))
    maxStringLength.foreach(_v => _obj$.updateDynamic("maxStringLength")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[InspectOptions]
  }
}
