package io.scalajs.nodejs.vm

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{DataView, Uint8Array}
import scala.scalajs.js.|

/** The vm module provides APIs for compiling and running code within V8 Virtual Machine contexts.
  * @see
  *   https://nodejs.org/api/vm.html
  */
@js.native
trait VM extends js.Object {
  def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
  def compileFunction(code: String, params: js.Array[String]): js.Function                                  = js.native
  def compileFunction(code: String): js.Function                                                            = js.native

  /** If given a sandbox object, the vm.createContext() method will [prepare that
    * sandbox][#vm_what_does_it_mean_to_contextify_an_object] so that it can be used in calls to vm.runInContext() or
    * script.runInContext(). Inside such scripts, the sandbox object will be the global object, retaining all of its
    * existing properties but also having the built-in objects and functions any standard global object has. Outside of
    * scripts run by the vm module, sandbox will remain unchanged.
    *
    * If sandbox is omitted (or passed explicitly as undefined), a new, empty contextified sandbox object will be
    * returned.
    *
    * The vm.createContext() method is primarily useful for creating a single sandbox that can be used to run multiple
    * scripts. For instance, if emulating a web browser, the method can be used to create a single sandbox representing
    * a window's global object, then run all <script> tags together within the context of that sandbox.
    * @param sandbox
    *   the given sandbox
    * @example
    *   vm.createContext([sandbox])
    * @since 0.11.7
    */
  def createContext(sandbox: js.Object, options: CreateContextOptions): Context = js.native
  def createContext(sandbox: js.Object): Context                                = js.native
  def createContext(): Context                                                  = js.native

  /** Returns true if the given sandbox object has been contextified using vm.createContext().
    * @param sandbox
    *   the sandbox
    * @return
    *   true if the given sandbox object has been contextified using vm.createContext().
    */
  def isContext(sandbox: js.Object): Boolean = js.native

  /** Runs the compiled code contained by the vm.Script object within the given contextifiedSandbox and returns the
    * result. Running code does not have access to local scope.
    * @param code
    *   The JavaScript code to compile and run.
    * @param contextifiedSandbox
    *   A contextified object as returned by the vm.createContext() method.
    * @param options
    *   the optional options
    * @example
    *   script.runInContext(contextifiedSandbox[, options])
    */
  def runInContext(code: String, contextifiedSandbox: Context, options: VMRunInContextOptions): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context): js.Any                                 = js.native

  /** First contextifies the given sandbox, runs the compiled code contained by the vm.Script object within the created
    * sandbox, and returns the result. Running code does not have access to local scope.
    * @param code
    *   The JavaScript code to compile and run.
    * @param sandbox
    *   An object that will be contextified. If undefined, a new object will be created.
    * @param options
    *   the optional options
    * @example
    *   vm.runInNewContext(code[, sandbox][, options])
    */
  def runInNewContext(code: String, sandbox: js.Any, options: VMRunInNewContextOptions): js.Any = js.native
  def runInNewContext(code: String, sandbox: js.Any): js.Any                                    = js.native

  /** Runs the compiled code contained by the vm.Script within the context of the current global object. Running code
    * does not have access to local scope, but does have access to the current global object.
    * @param code
    *   The JavaScript code to compile and run.
    * @param options
    *   the optional options
    * @example
    *   script.runInThisContext([options])
    */
  def runInThisContext(code: String, options: VMRunInContextOptions): Script = js.native
  def runInThisContext(code: String): Script                                 = js.native
}

/** Virtual Machine Singleton
  */
@js.native
@JSImport("vm", JSImport.Namespace)
object VM extends VM

trait CompileFunctionOptions extends js.Object {
  var filename: js.UndefOr[String]                       = js.undefined
  var lineOffset: js.UndefOr[Int]                        = js.undefined
  var columnOffset: js.UndefOr[Int]                      = js.undefined
  var cachedData: js.UndefOr[Uint8Array | DataView]      = js.undefined
  var parsingContext: js.UndefOr[js.Object]              = js.undefined
  var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object CompileFunctionOptions {
  def apply(
      filename: js.UndefOr[String] = js.undefined,
      lineOffset: js.UndefOr[Int] = js.undefined,
      columnOffset: js.UndefOr[Int] = js.undefined,
      cachedData: js.UndefOr[js.typedarray.Uint8Array | js.typedarray.DataView] = js.undefined,
      parsingContext: js.UndefOr[js.Object] = js.undefined,
      contextExtensions: js.UndefOr[js.Array[js.Object]] = js.undefined
  ): CompileFunctionOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    lineOffset.foreach(_v => _obj$.updateDynamic("lineOffset")(_v.asInstanceOf[js.Any]))
    columnOffset.foreach(_v => _obj$.updateDynamic("columnOffset")(_v.asInstanceOf[js.Any]))
    cachedData.foreach(_v => _obj$.updateDynamic("cachedData")(_v.asInstanceOf[js.Any]))
    parsingContext.foreach(_v => _obj$.updateDynamic("parsingContext")(_v.asInstanceOf[js.Any]))
    contextExtensions.foreach(_v => _obj$.updateDynamic("contextExtensions")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CompileFunctionOptions]
  }
}

trait CreateContextOptions extends js.Object {
  var name: js.UndefOr[String]                   = js.undefined
  var origin: js.UndefOr[String]                 = js.undefined
  var codeGeneration: js.UndefOr[CodeGeneration] = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var microtaskMode: js.UndefOr[String] = js.undefined
}
object CreateContextOptions {
  def apply(
      name: js.UndefOr[String] = js.undefined,
      origin: js.UndefOr[String] = js.undefined,
      codeGeneration: js.UndefOr[CodeGeneration] = js.undefined,
      microtaskMode: js.UndefOr[String] = js.undefined
  ): CreateContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    name.foreach(_v => _obj$.updateDynamic("name")(_v.asInstanceOf[js.Any]))
    origin.foreach(_v => _obj$.updateDynamic("origin")(_v.asInstanceOf[js.Any]))
    codeGeneration.foreach(_v => _obj$.updateDynamic("codeGeneration")(_v.asInstanceOf[js.Any]))
    microtaskMode.foreach(_v => _obj$.updateDynamic("microtaskMode")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CreateContextOptions]
  }
}

trait VMRunInNewContextOptions extends js.Object {
  var filename: js.UndefOr[String]                      = js.undefined
  var lineOffset: js.UndefOr[Int]                       = js.undefined
  var columnOffset: js.UndefOr[Int]                     = js.undefined
  var displayErrors: js.UndefOr[Boolean]                = js.undefined
  var timeout: js.UndefOr[Int]                          = js.undefined
  var breakOnSigint: js.UndefOr[Boolean]                = js.undefined
  var contextName: js.UndefOr[String]                   = js.undefined
  var contextOrigin: js.UndefOr[String]                 = js.undefined
  var contextCodeGeneration: js.UndefOr[CodeGeneration] = js.undefined
  var cachedData: js.UndefOr[Uint8Array | DataView]     = js.undefined
  var produceCachedData: js.UndefOr[Boolean]            = js.undefined
  var importModuleDynamically: js.UndefOr[js.Function]  = js.undefined
}
object VMRunInNewContextOptions {
  def apply(
      filename: js.UndefOr[String] = js.undefined,
      lineOffset: js.UndefOr[Int] = js.undefined,
      columnOffset: js.UndefOr[Int] = js.undefined,
      displayErrors: js.UndefOr[Boolean] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      breakOnSigint: js.UndefOr[Boolean] = js.undefined,
      contextName: js.UndefOr[String] = js.undefined,
      contextOrigin: js.UndefOr[String] = js.undefined,
      contextCodeGeneration: js.UndefOr[CodeGeneration] = js.undefined,
      cachedData: js.UndefOr[js.typedarray.Uint8Array | js.typedarray.DataView] = js.undefined,
      produceCachedData: js.UndefOr[Boolean] = js.undefined,
      importModuleDynamically: js.UndefOr[js.Function] = js.undefined
  ): VMRunInNewContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    lineOffset.foreach(_v => _obj$.updateDynamic("lineOffset")(_v.asInstanceOf[js.Any]))
    columnOffset.foreach(_v => _obj$.updateDynamic("columnOffset")(_v.asInstanceOf[js.Any]))
    displayErrors.foreach(_v => _obj$.updateDynamic("displayErrors")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    breakOnSigint.foreach(_v => _obj$.updateDynamic("breakOnSigint")(_v.asInstanceOf[js.Any]))
    contextName.foreach(_v => _obj$.updateDynamic("contextName")(_v.asInstanceOf[js.Any]))
    contextOrigin.foreach(_v => _obj$.updateDynamic("contextOrigin")(_v.asInstanceOf[js.Any]))
    contextCodeGeneration.foreach(_v => _obj$.updateDynamic("contextCodeGeneration")(_v.asInstanceOf[js.Any]))
    cachedData.foreach(_v => _obj$.updateDynamic("cachedData")(_v.asInstanceOf[js.Any]))
    produceCachedData.foreach(_v => _obj$.updateDynamic("produceCachedData")(_v.asInstanceOf[js.Any]))
    importModuleDynamically.foreach(_v => _obj$.updateDynamic("importModuleDynamically")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[VMRunInNewContextOptions]
  }
}

trait VMRunInContextOptions extends js.Object {
  var filename: js.UndefOr[String]                     = js.undefined
  var lineOffset: js.UndefOr[Int]                      = js.undefined
  var columnOffset: js.UndefOr[Int]                    = js.undefined
  var displayErrors: js.UndefOr[Boolean]               = js.undefined
  var timeout: js.UndefOr[Int]                         = js.undefined
  var breakOnSigint: js.UndefOr[Boolean]               = js.undefined
  var cachedData: js.UndefOr[Uint8Array | DataView]    = js.undefined
  var produceCachedData: js.UndefOr[Boolean]           = js.undefined
  var importModuleDynamically: js.UndefOr[js.Function] = js.undefined
}
object VMRunInContextOptions {
  def apply(
      filename: js.UndefOr[String] = js.undefined,
      lineOffset: js.UndefOr[Int] = js.undefined,
      columnOffset: js.UndefOr[Int] = js.undefined,
      displayErrors: js.UndefOr[Boolean] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      breakOnSigint: js.UndefOr[Boolean] = js.undefined,
      cachedData: js.UndefOr[js.typedarray.Uint8Array | js.typedarray.DataView] = js.undefined,
      produceCachedData: js.UndefOr[Boolean] = js.undefined,
      importModuleDynamically: js.UndefOr[js.Function] = js.undefined
  ): VMRunInContextOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    lineOffset.foreach(_v => _obj$.updateDynamic("lineOffset")(_v.asInstanceOf[js.Any]))
    columnOffset.foreach(_v => _obj$.updateDynamic("columnOffset")(_v.asInstanceOf[js.Any]))
    displayErrors.foreach(_v => _obj$.updateDynamic("displayErrors")(_v.asInstanceOf[js.Any]))
    timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
    breakOnSigint.foreach(_v => _obj$.updateDynamic("breakOnSigint")(_v.asInstanceOf[js.Any]))
    cachedData.foreach(_v => _obj$.updateDynamic("cachedData")(_v.asInstanceOf[js.Any]))
    produceCachedData.foreach(_v => _obj$.updateDynamic("produceCachedData")(_v.asInstanceOf[js.Any]))
    importModuleDynamically.foreach(_v => _obj$.updateDynamic("importModuleDynamically")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[VMRunInContextOptions]
  }
}
