package io.scalajs.nodejs.vm

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{DataView, Uint8Array}
import scala.scalajs.js.|

/** Contextify Script
  */
@js.native
@JSImport("vm", "Script")
class Script protected () extends js.Object {
  def this(code: String, options: ScriptOptions) = this()
  def this(code: String, filename: String) = this()
  def this(code: String) = this()

  def createCachedData(): io.scalajs.nodejs.buffer.Buffer = js.native

  /** Runs the compiled code contained by the vm.Script object within the given contextifiedSandbox and returns the
    * result. Running code does not have access to local scope.
    * @param contextifiedSandbox
    *   A contextified object as returned by the vm.createContext() method.
    * @param options
    *   the optional options
    * @example
    *   script.runInContext(contextifiedSandbox[, options])
    */
  def runInContext(contextifiedSandbox: Context, options: RunInContextOptions): js.Any = js.native
  def runInContext(contextifiedSandbox: Context): js.Any                               = js.native

  /** First contextifies the given sandbox, runs the compiled code contained by the vm.Script object within the created
    * sandbox, and returns the result. Running code does not have access to local scope.
    * @param sandbox
    *   An object that will be contextified. If undefined, a new object will be created.
    * @param options
    *   the optional options
    * @example
    *   script.runInNewContext([sandbox][, options])
    */
  def runInNewContext(sandbox: js.Object, options: RunInNewContextOptions): js.Any = js.native
  def runInNewContext(sandbox: js.Object): js.Any                                  = js.native
  def runInNewContext(): js.Any                                                    = js.native

  /** Runs the compiled code contained by the vm.Script within the context of the current global object. Running code
    * does not have access to local scope, but does have access to the current global object.
    * @param options
    *   the optional options
    * @example
    *   script.runInThisContext([options])
    */
  def runInThisContext(options: RunInContextOptions): Script = js.native
  def runInThisContext(): Script                             = js.native
}

trait ScriptOptions extends js.Object {
  var filename: js.UndefOr[String]                     = js.undefined
  var lineOffset: js.UndefOr[Int]                      = js.undefined
  var columnOffset: js.UndefOr[Int]                    = js.undefined
  var cachedData: js.UndefOr[Uint8Array | DataView]    = js.undefined
  var produceCachedData: js.UndefOr[Boolean]           = js.undefined
  var importModuleDynamically: js.UndefOr[js.Function] = js.undefined
}
object ScriptOptions {
  def apply(
      filename: js.UndefOr[String] = js.undefined,
      lineOffset: js.UndefOr[Int] = js.undefined,
      columnOffset: js.UndefOr[Int] = js.undefined,
      cachedData: js.UndefOr[js.typedarray.Uint8Array | js.typedarray.DataView] = js.undefined,
      produceCachedData: js.UndefOr[Boolean] = js.undefined,
      importModuleDynamically: js.UndefOr[js.Function] = js.undefined
  ): ScriptOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    lineOffset.foreach(_v => _obj$.updateDynamic("lineOffset")(_v.asInstanceOf[js.Any]))
    columnOffset.foreach(_v => _obj$.updateDynamic("columnOffset")(_v.asInstanceOf[js.Any]))
    cachedData.foreach(_v => _obj$.updateDynamic("cachedData")(_v.asInstanceOf[js.Any]))
    produceCachedData.foreach(_v => _obj$.updateDynamic("produceCachedData")(_v.asInstanceOf[js.Any]))
    importModuleDynamically.foreach(_v => _obj$.updateDynamic("importModuleDynamically")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ScriptOptions]
  }
}

trait RunInContextOptions extends js.Object {
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Int]           = js.undefined
  var breakOnSigint: js.UndefOr[Boolean] = js.undefined
}
object RunInContextOptions {
  def apply(
      displayErrors: js.UndefOr[Boolean] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      breakOnSigint: js.UndefOr[Boolean] = js.undefined
  ): RunInContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    displayErrors.foreach(_v => _obj$.updateDynamic("displayErrors")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    breakOnSigint.foreach(_v => _obj$.updateDynamic("breakOnSigint")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RunInContextOptions]
  }
}

trait RunInNewContextOptions extends js.Object {
  var displayErrors: js.UndefOr[Boolean]                = js.undefined
  var timeout: js.UndefOr[Int]                          = js.undefined
  var breakOnSigint: js.UndefOr[Boolean]                = js.undefined
  var contextName: js.UndefOr[String]                   = js.undefined
  var contextOrigin: js.UndefOr[String]                 = js.undefined
  var contextCodeGeneration: js.UndefOr[CodeGeneration] = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var microtaskMode: js.UndefOr[String] = js.undefined
}
object RunInNewContextOptions {
  def apply(
      displayErrors: js.UndefOr[Boolean] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      breakOnSigint: js.UndefOr[Boolean] = js.undefined,
      contextName: js.UndefOr[String] = js.undefined,
      contextOrigin: js.UndefOr[String] = js.undefined,
      contextCodeGeneration: js.UndefOr[CodeGeneration] = js.undefined,
      microtaskMode: js.UndefOr[String] = js.undefined
  ): RunInNewContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    displayErrors.foreach(_v => _obj$.updateDynamic("displayErrors")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    breakOnSigint.foreach(_v => _obj$.updateDynamic("breakOnSigint")(_v.asInstanceOf[js.Any]))
    contextName.foreach(_v => _obj$.updateDynamic("contextName")(_v.asInstanceOf[js.Any]))
    contextOrigin.foreach(_v => _obj$.updateDynamic("contextOrigin")(_v.asInstanceOf[js.Any]))
    contextCodeGeneration.foreach(_v => _obj$.updateDynamic("contextCodeGeneration")(_v.asInstanceOf[js.Any]))
    microtaskMode.foreach(_v => _obj$.updateDynamic("microtaskMode")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RunInNewContextOptions]
  }
}

trait CodeGeneration extends js.Object {
  var strings: js.UndefOr[Boolean] = js.undefined
  var wasm: js.UndefOr[Boolean]    = js.undefined
}
object CodeGeneration {
  def apply(
      strings: js.UndefOr[Boolean] = js.undefined,
      wasm: js.UndefOr[Boolean] = js.undefined
  ): CodeGeneration = {
    val _obj$ = js.Dynamic.literal(
    )
    strings.foreach(_v => _obj$.updateDynamic("strings")(_v.asInstanceOf[js.Any]))
    wasm.foreach(_v => _obj$.updateDynamic("wasm")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CodeGeneration]
  }
}
