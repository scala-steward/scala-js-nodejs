package io.scalajs.nodejs.repl

import com.thoughtworks.enableIf
import io.scalajs.nodejs.stream

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** The repl module provides a Read-Eval-Print-Loop (REPL) implementation that is available both as a standalone program
  * or includable in other applications.
  * @see
  *   https://nodejs.org/api/repl.html#repl_repl
  */
@js.native
trait REPL extends js.Object {
  var REPL_MODE_SLOPPY: js.Symbol = js.native
  var REPL_MODE_STRICT: js.Symbol = js.native

  def start(options: StartOptions): REPLServer = js.native
  def start(prompt: String): REPLServer        = js.native
  def start(): REPLServer                      = js.native
}

trait StartOptions extends js.Object {
  var prompt: js.UndefOr[String]                                                  = js.undefined
  var input: js.UndefOr[stream.IReadable]                                         = js.undefined
  var output: js.UndefOr[stream.IWritable]                                        = js.undefined
  var terminal: js.UndefOr[Boolean]                                               = js.undefined
  var eval: js.UndefOr[js.Function4[String, js.Object, String, js.Function, Any]] = js.undefined
  var useColors: js.UndefOr[Boolean]                                              = js.undefined
  var useGlobal: js.UndefOr[Boolean]                                              = js.undefined
  var ignoreUndefined: js.UndefOr[Boolean]                                        = js.undefined
  var writer: js.UndefOr[js.Function1[js.Any, Any]]                               = js.undefined
  var completer: js.UndefOr[js.Function]                                          = js.undefined
  var replMode: js.UndefOr[js.Symbol]                                             = js.undefined
  var breakEvalOnSigint: js.UndefOr[Boolean]                                      = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var preview: js.UndefOr[Boolean] = js.undefined
}

object StartOptions {

  def apply(
      prompt: js.UndefOr[String] = js.undefined,
      input: js.UndefOr[stream.IReadable] = js.undefined,
      output: js.UndefOr[stream.IWritable] = js.undefined,
      terminal: js.UndefOr[Boolean] = js.undefined,
      eval: js.UndefOr[js.Function4[String, js.Object, String, js.Function, Any]] = js.undefined,
      useColors: js.UndefOr[Boolean] = js.undefined,
      useGlobal: js.UndefOr[Boolean] = js.undefined,
      ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
      writer: js.UndefOr[js.Function1[js.Any, Any]] = js.undefined,
      completer: js.UndefOr[js.Function] = js.undefined,
      replMode: js.UndefOr[js.Symbol] = js.undefined,
      breakEvalOnSigint: js.UndefOr[Boolean] = js.undefined,
      preview: js.UndefOr[Boolean] = js.undefined
  ): StartOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    prompt.foreach(_v => _obj$.updateDynamic("prompt")(_v.asInstanceOf[js.Any]))
    input.foreach(_v => _obj$.updateDynamic("input")(_v.asInstanceOf[js.Any]))
    output.foreach(_v => _obj$.updateDynamic("output")(_v.asInstanceOf[js.Any]))
    terminal.foreach(_v => _obj$.updateDynamic("terminal")(_v.asInstanceOf[js.Any]))
    eval.foreach(_v => _obj$.updateDynamic("eval")(_v.asInstanceOf[js.Any]))
    useColors.foreach(_v => _obj$.updateDynamic("useColors")(_v.asInstanceOf[js.Any]))
    useGlobal.foreach(_v => _obj$.updateDynamic("useGlobal")(_v.asInstanceOf[js.Any]))
    ignoreUndefined.foreach(_v => _obj$.updateDynamic("ignoreUndefined")(_v.asInstanceOf[js.Any]))
    writer.foreach(_v => _obj$.updateDynamic("writer")(_v.asInstanceOf[js.Any]))
    completer.foreach(_v => _obj$.updateDynamic("completer")(_v.asInstanceOf[js.Any]))
    replMode.foreach(_v => _obj$.updateDynamic("replMode")(_v.asInstanceOf[js.Any]))
    breakEvalOnSigint.foreach(_v => _obj$.updateDynamic("breakEvalOnSigint")(_v.asInstanceOf[js.Any]))
    preview.foreach(_v => _obj$.updateDynamic("preview")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[StartOptions]
  }
}

/** REPL Singleton
  */
@js.native
@JSImport("repl", JSImport.Namespace)
object REPL extends REPL
