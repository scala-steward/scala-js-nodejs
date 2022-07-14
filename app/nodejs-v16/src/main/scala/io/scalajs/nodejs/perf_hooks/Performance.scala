package io.scalajs.nodejs.perf_hooks

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("perf_hooks", "Performance")
class Performance extends js.Object {

  def clearMarks(): Unit             = js.native
  def clearMarks(name: String): Unit = js.native

  def mark(): Unit             = js.native
  def mark(name: String): Unit = js.native

  def measure(name: String, statMark: String, endMark: String): Unit = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def measure(name: String, statMark: String): Unit = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def measure(name: String): Unit = js.native

  def nodeTiming: PerformanceNodeTiming = js.native

  def now(): Double = js.native

  def timeOrigin: Double = js.native

  def timerify[T <: js.Function](fn: T): T = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def toJSON(): PerformanceResultJson = js.native

  def eventLoopUtilization(): EventLoopUtilizationResult = js.native
}

@js.native
@JSImport("perf_hooks", "performance")
object Performance extends Performance

trait PerformanceEntry extends js.Object {
  var duration: Double
  var name: String
  var startTime: Double
  var entryType: String
  var kind: js.UndefOr[Int] = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var flags: js.UndefOr[Int] = js.undefined

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  var details: js.Any
}

object PerformanceEntry {
  def apply(
      duration: Double,
      name: String,
      startTime: Double,
      entryType: String,
      details: js.Any,
      kind: js.UndefOr[Int] = js.undefined,
      flags: js.UndefOr[Int] = js.undefined
  ): PerformanceEntry = {
    val _obj$ = js.Dynamic.literal(
      "duration"  -> duration.asInstanceOf[js.Any],
      "name"      -> name.asInstanceOf[js.Any],
      "startTime" -> startTime.asInstanceOf[js.Any],
      "entryType" -> entryType.asInstanceOf[js.Any],
      "details"   -> details.asInstanceOf[js.Any]
    )
    kind.foreach(_v => _obj$.updateDynamic("kind")(_v.asInstanceOf[js.Any]))
    flags.foreach(_v => _obj$.updateDynamic("flags")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PerformanceEntry]
  }
}

trait PerformanceNodeTiming extends PerformanceEntry {
  var bootstrapComplete: Double
  var environment: Double
  var loopExit: Double
  var loopStart: Double
  var nodeStart: Double
  var v8Start: Double

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  var idleTime: Double
}

object PerformanceNodeTiming {
  def apply(
      bootstrapComplete: Double,
      environment: Double,
      loopExit: Double,
      loopStart: Double,
      nodeStart: Double,
      v8Start: Double,
      duration: Double,
      name: String,
      startTime: Double,
      entryType: String,
      details: js.Any,
      idleTime: Double,
      kind: js.UndefOr[Int] = js.undefined,
      flags: js.UndefOr[Int] = js.undefined
  ): PerformanceNodeTiming = {
    val _obj$ = js.Dynamic.literal(
      "bootstrapComplete" -> bootstrapComplete.asInstanceOf[js.Any],
      "environment"       -> environment.asInstanceOf[js.Any],
      "loopExit"          -> loopExit.asInstanceOf[js.Any],
      "loopStart"         -> loopStart.asInstanceOf[js.Any],
      "nodeStart"         -> nodeStart.asInstanceOf[js.Any],
      "v8Start"           -> v8Start.asInstanceOf[js.Any],
      "duration"          -> duration.asInstanceOf[js.Any],
      "name"              -> name.asInstanceOf[js.Any],
      "startTime"         -> startTime.asInstanceOf[js.Any],
      "entryType"         -> entryType.asInstanceOf[js.Any],
      "details"           -> details.asInstanceOf[js.Any],
      "idleTime"          -> idleTime.asInstanceOf[js.Any]
    )
    kind.foreach(_v => _obj$.updateDynamic("kind")(_v.asInstanceOf[js.Any]))
    flags.foreach(_v => _obj$.updateDynamic("flags")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PerformanceNodeTiming]
  }
}

@js.native
@JSImport("perf_hooks", "constants")
object Constants extends Constants

@js.native
trait Constants extends js.Object {
  val NODE_PERFORMANCE_GC_MAJOR: Int       = js.native
  val NODE_PERFORMANCE_GC_MINOR: Int       = js.native
  val NODE_PERFORMANCE_GC_INCREMENTAL: Int = js.native
  val NODE_PERFORMANCE_GC_WEAKCB: Int      = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_NO: Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_FORCED: Int =
    js.native
  @enableIf(
    io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14
  ) val NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING: Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE: Int =
    js.native
}
