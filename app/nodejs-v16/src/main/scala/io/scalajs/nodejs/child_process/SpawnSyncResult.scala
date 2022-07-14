package io.scalajs.nodejs.child_process

import scala.scalajs.js
import scala.scalajs.js.|

trait SpawnSyncResult extends js.Object {
  var pid: Int
  var output: js.Array[Output]
  var stdout: Output
  var stderr: Output
  var status: Int | Null
  var signal: String | Null
  var error: js.UndefOr[js.Error] = js.undefined
}

object SpawnSyncResult {
  def apply(
      pid: Int,
      output: js.Array[Output],
      stdout: Output,
      stderr: Output,
      status: Int | Null = null,
      signal: String | Null = null,
      error: js.UndefOr[js.Error] = js.undefined
  ): SpawnSyncResult = {
    val _obj$ = js.Dynamic.literal(
      "pid"    -> pid.asInstanceOf[js.Any],
      "output" -> output.asInstanceOf[js.Any],
      "stdout" -> stdout.asInstanceOf[js.Any],
      "stderr" -> stderr.asInstanceOf[js.Any],
      "status" -> status.asInstanceOf[js.Any],
      "signal" -> signal.asInstanceOf[js.Any]
    )
    error.foreach(_v => _obj$.updateDynamic("error")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SpawnSyncResult]
  }
}
