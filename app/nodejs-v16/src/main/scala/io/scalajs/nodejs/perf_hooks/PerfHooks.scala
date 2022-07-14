package io.scalajs.nodejs.perf_hooks

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait PerfHooks extends js.Object {
  def constants: Constants = js.native

  def eventLoopUtilization(utilization1: EventLoopUtilizationResult,
                           utilization2: EventLoopUtilizationResult
  ): EventLoopUtilizationResult = js.native

  def monitorEventLoopDelay(): Histogram                                      = js.native
  def monitorEventLoopDelay(options: MonitorEventLoopDelayOptions): Histogram = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def performance: Performance = js.native
}

trait EventLoopUtilizationResult extends js.Object {
  var idle: Double
  var active: Double
  var utilization: Double
}
object EventLoopUtilizationResult {
  def apply(
      idle: Double,
      active: Double,
      utilization: Double
  ): EventLoopUtilizationResult = {
    val _obj$ = js.Dynamic.literal(
      "idle"        -> idle.asInstanceOf[js.Any],
      "active"      -> active.asInstanceOf[js.Any],
      "utilization" -> utilization.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[EventLoopUtilizationResult]
  }
}

trait PerformanceResultJson extends js.Object {
  var nodeTiming: PerformanceNodeTiming
  var timeOrigin: Double
  var eventLoopUtilization: EventLoopUtilizationResult
}
object PerformanceResultJson {
  def apply(
      nodeTiming: PerformanceNodeTiming,
      timeOrigin: Double,
      eventLoopUtilization: EventLoopUtilizationResult
  ): PerformanceResultJson = {
    val _obj$ = js.Dynamic.literal(
      "nodeTiming"           -> nodeTiming.asInstanceOf[js.Any],
      "timeOrigin"           -> timeOrigin.asInstanceOf[js.Any],
      "eventLoopUtilization" -> eventLoopUtilization.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PerformanceResultJson]
  }
}

@js.native
@JSImport("perf_hooks", JSImport.Namespace)
object PerfHooks extends PerfHooks
