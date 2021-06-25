package io.scalajs.nodejs.worker_threads

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("worker_threads", "Worker")
class Worker protected () extends js.Object with MessagePoster {
  def this(filename: String, workerOptions: WorkerOptions) = this()
  def this(filename: String) = this()

  def ref(): Unit   = js.native
  def unref(): Unit = js.native

  // TODO: No need to UnderOr when Node.js v10 dropepd
  def terminate(): js.UndefOr[js.Promise[Unit]] = js.native

  def threadId: Int = js.native

  def stderr: io.scalajs.nodejs.stream.Readable       = js.native
  def stdout: io.scalajs.nodejs.stream.Readable       = js.native
  def stdin: io.scalajs.nodejs.stream.Writable | Null = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs12)
  def resourceLimits: ResourceLimits = js.native
}
