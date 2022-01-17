package io.scalajs.nodejs.perf_hooks

import com.thoughtworks.{enableIf, enableMembersIf}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("perf_hooks", "PerformanceObserver")
class PerformanceObserver(callback: js.Function2[PerformanceObserverEntryList, PerformanceObserver, Any])
    extends js.Object {
  def disconnect(): Unit = js.native

  def observe(options: ObserveOptions): Unit = js.native
}

trait ObserveOptions extends js.Object {
  var entryTypes: js.Array[String]
  var buffered: js.UndefOr[Boolean] = js.undefined
}
object ObserveOptions {
  def apply(
      entryTypes: js.Array[String],
      buffered: js.UndefOr[Boolean] = js.undefined
  ): ObserveOptions = {
    val _obj$ = js.Dynamic.literal(
      "entryTypes" -> entryTypes.asInstanceOf[js.Any]
    )
    buffered.foreach(_v => _obj$.updateDynamic("buffered")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ObserveOptions]
  }
}

@js.native
trait PerformanceObserverEntryList extends js.Object {
  def getEntries(): js.Array[PerformanceEntry] = js.native

  def getEntriesByName(name: String): js.Array[PerformanceEntry]                 = js.native
  def getEntriesByName(name: String, `type`: String): js.Array[PerformanceEntry] = js.native

  def getEntriesByType(`type`: String): js.Array[PerformanceEntry] = js.native

  def monitorEventLoopDelay(): Histogram                                      = js.native
  def monitorEventLoopDelay(options: MonitorEventLoopDelayOptions): Histogram = js.native
}

@js.native
trait Histogram extends js.Object {
  def disable(): Boolean                = js.native
  def enable(): Boolean                 = js.native
  def exceeds: Double                   = js.native
  def max: Double                       = js.native
  def mean: Double                      = js.native
  def min: Double                       = js.native
  def percentile(value: Double): Double = js.native
  def stddev: Double                    = js.native

  def percentiles: js.Map[Double, Double] = js.native

  def reset(): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def record(value: Double): Unit = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def record(value: js.BigInt): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def recordDelta(): Unit = js.native
}

trait MonitorEventLoopDelayOptions extends js.Object {
  var resolution: js.UndefOr[Double] = js.undefined
}
object MonitorEventLoopDelayOptions {
  def apply(
      resolution: js.UndefOr[Double] = js.undefined
  ): MonitorEventLoopDelayOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    resolution.foreach(_v => _obj$.updateDynamic("resolution")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[MonitorEventLoopDelayOptions]
  }
}
