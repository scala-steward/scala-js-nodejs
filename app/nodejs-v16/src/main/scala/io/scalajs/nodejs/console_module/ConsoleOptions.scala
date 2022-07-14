package io.scalajs.nodejs.console_module

import io.scalajs.nodejs.stream.IWritable
import io.scalajs.nodejs.util.InspectOptions

import scala.scalajs.js
import scala.scalajs.js.|

trait ConsoleOptions extends js.Object {
  var stdout: IWritable
  var stderr: js.UndefOr[IWritable] = js.undefined

  /** Ignore errors when writing to the underlying streams. Defaults to `true`.
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined

  /** Set color support for this `Console` instance. Setting to `true` enables coloring while inspecting values, setting
    * to `'auto'` will make color support depend on the value of the `isTTY` property and the value returned by
    * `getColorDepth()` on the respective stream. This option can not be used, if `inspectOptions.colors` is set as
    * well. Defaults to `'auto'`.
    */
  var colorMode: js.UndefOr[Boolean | String] = js.undefined

  /** Specifies options that are passed along to [[io.scalajs.nodejs.util.Util.inspect()]]. Node.js v11.7.0.
    */
  var inspectOptions: js.UndefOr[InspectOptions] = js.undefined

  /** Set group indentation. Default: 2. Node.js v14.2.0.
    */
  var groupIndentation: js.UndefOr[Int] = js.undefined
}

object ConsoleOptions {
  def apply(
      stdout: IWritable,
      stderr: js.UndefOr[IWritable] = js.undefined,
      ignoreErrors: js.UndefOr[Boolean] = js.undefined,
      colorMode: js.UndefOr[Boolean | String] = js.undefined,
      inspectOptions: js.UndefOr[InspectOptions] = js.undefined,
      groupIndentation: js.UndefOr[Int] = js.undefined
  ): ConsoleOptions = {
    val _obj$ = js.Dynamic.literal(
      "stdout" -> stdout.asInstanceOf[js.Any]
    )
    stderr.foreach(_v => _obj$.updateDynamic("stderr")(_v.asInstanceOf[js.Any]))
    ignoreErrors.foreach(_v => _obj$.updateDynamic("ignoreErrors")(_v.asInstanceOf[js.Any]))
    colorMode.foreach(_v => _obj$.updateDynamic("colorMode")(_v.asInstanceOf[js.Any]))
    inspectOptions.foreach(_v => _obj$.updateDynamic("inspectOptions")(_v.asInstanceOf[js.Any]))
    groupIndentation.foreach(_v => _obj$.updateDynamic("groupIndentation")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ConsoleOptions]
  }
}
