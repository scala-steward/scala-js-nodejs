package io.scalajs.nodejs
package perf_hooks

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait PerfHooks extends js.Object {
  def constants: Constants = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12) def monitorEventLoopDelay(): Histogram = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12) def monitorEventLoopDelay(
      options: MonitorEventLoopDelayOptions
  ): Histogram = js.native
}

@js.native
@JSImport("perf_hooks", JSImport.Namespace)
object PerfHooks extends PerfHooks
