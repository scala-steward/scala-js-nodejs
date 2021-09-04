package io.scalajs.nodejs.perf_hooks

import net.exoego.scalajs.types.util.Factory

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait PerfHooks extends js.Object {
  def constants: Constants = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12)
  def eventLoopUtilization(utilization1: EventLoopUtilizationResult,
                           utilization2: EventLoopUtilizationResult
  ): EventLoopUtilizationResult = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12) def monitorEventLoopDelay(): Histogram = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12) def monitorEventLoopDelay(
      options: MonitorEventLoopDelayOptions
  ): Histogram = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def performance: Performance = js.native
}

@Factory
trait EventLoopUtilizationResult extends js.Object {
  var idle: Double
  var active: Double
  var utilization: Double
}
@js.native
trait PerformanceResultJson extends js.Object {
  var nodeTiming: PerformanceNodeTiming                = js.native
  var timeOrigin: Double                               = js.native
  var eventLoopUtilization: EventLoopUtilizationResult = js.native
}

@js.native
@JSImport("perf_hooks", JSImport.Namespace)
object PerfHooks extends PerfHooks
