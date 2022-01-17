package io.scalajs.nodejs.readline

import io.scalajs.nodejs.stream.{IReadable, IWritable}

import scala.scalajs.js

trait ReadlineOptions extends js.Object {
  var input: js.UndefOr[IReadable]                 = js.undefined
  var output: js.UndefOr[IWritable]                = js.undefined
  var completer: js.UndefOr[js.Function]           = js.undefined
  var terminal: js.UndefOr[Boolean]                = js.undefined
  var historySize: js.UndefOr[Int]                 = js.undefined
  var prompt: js.UndefOr[String]                   = js.undefined
  var crlfDelay: js.UndefOr[Double]                = js.undefined
  var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
  var escapeCodeTimeout: js.UndefOr[Double]        = js.undefined
  var tabSize: js.UndefOr[Int]                     = js.undefined
}

object ReadlineOptions {
  def apply(
      input: js.UndefOr[IReadable] = js.undefined,
      output: js.UndefOr[IWritable] = js.undefined,
      completer: js.UndefOr[js.Function] = js.undefined,
      terminal: js.UndefOr[Boolean] = js.undefined,
      historySize: js.UndefOr[Int] = js.undefined,
      prompt: js.UndefOr[String] = js.undefined,
      crlfDelay: js.UndefOr[Double] = js.undefined,
      removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined,
      escapeCodeTimeout: js.UndefOr[Double] = js.undefined,
      tabSize: js.UndefOr[Int] = js.undefined
  ): ReadlineOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    input.foreach(_v => _obj$.updateDynamic("input")(_v.asInstanceOf[js.Any]))
    output.foreach(_v => _obj$.updateDynamic("output")(_v.asInstanceOf[js.Any]))
    completer.foreach(_v => _obj$.updateDynamic("completer")(_v.asInstanceOf[js.Any]))
    terminal.foreach(_v => _obj$.updateDynamic("terminal")(_v.asInstanceOf[js.Any]))
    historySize.foreach(_v => _obj$.updateDynamic("historySize")(_v.asInstanceOf[js.Any]))
    prompt.foreach(_v => _obj$.updateDynamic("prompt")(_v.asInstanceOf[js.Any]))
    crlfDelay.foreach(_v => _obj$.updateDynamic("crlfDelay")(_v.asInstanceOf[js.Any]))
    removeHistoryDuplicates.foreach(_v => _obj$.updateDynamic("removeHistoryDuplicates")(_v.asInstanceOf[js.Any]))
    escapeCodeTimeout.foreach(_v => _obj$.updateDynamic("escapeCodeTimeout")(_v.asInstanceOf[js.Any]))
    tabSize.foreach(_v => _obj$.updateDynamic("tabSize")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ReadlineOptions]
  }
}
