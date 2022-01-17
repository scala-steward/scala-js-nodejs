package io.scalajs.nodejs.worker_threads

import com.thoughtworks.enableIf

import scala.scalajs.js

trait WorkerOptions extends js.Object {
  var env: js.UndefOr[js.Object]             = js.undefined
  var eval: js.UndefOr[Boolean]              = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var stdin: js.UndefOr[Boolean]             = js.undefined
  var stdout: js.UndefOr[Boolean]            = js.undefined
  var stderr: js.UndefOr[Boolean]            = js.undefined
  var workerData: js.UndefOr[js.Any]         = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var transferList: js.UndefOr[js.Array[js.Object]] = js.undefined

  var resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
}

object WorkerOptions {
  def apply(
      env: js.UndefOr[js.Object] = js.undefined,
      eval: js.UndefOr[Boolean] = js.undefined,
      execArgv: js.UndefOr[js.Array[String]] = js.undefined,
      stdin: js.UndefOr[Boolean] = js.undefined,
      stdout: js.UndefOr[Boolean] = js.undefined,
      stderr: js.UndefOr[Boolean] = js.undefined,
      workerData: js.UndefOr[js.Any] = js.undefined,
      trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined,
      transferList: js.UndefOr[js.Array[js.Object]] = js.undefined,
      resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
  ): WorkerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    env.foreach(_v => _obj$.updateDynamic("env")(_v.asInstanceOf[js.Any]))
    eval.foreach(_v => _obj$.updateDynamic("eval")(_v.asInstanceOf[js.Any]))
    execArgv.foreach(_v => _obj$.updateDynamic("execArgv")(_v.asInstanceOf[js.Any]))
    stdin.foreach(_v => _obj$.updateDynamic("stdin")(_v.asInstanceOf[js.Any]))
    stdout.foreach(_v => _obj$.updateDynamic("stdout")(_v.asInstanceOf[js.Any]))
    stderr.foreach(_v => _obj$.updateDynamic("stderr")(_v.asInstanceOf[js.Any]))
    workerData.foreach(_v => _obj$.updateDynamic("workerData")(_v.asInstanceOf[js.Any]))
    trackUnmanagedFds.foreach(_v => _obj$.updateDynamic("trackUnmanagedFds")(_v.asInstanceOf[js.Any]))
    transferList.foreach(_v => _obj$.updateDynamic("transferList")(_v.asInstanceOf[js.Any]))
    resourceLimits.foreach(_v => _obj$.updateDynamic("resourceLimits")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[WorkerOptions]
  }
}
