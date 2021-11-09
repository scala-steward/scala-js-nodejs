package io.scalajs.nodejs.worker_threads

import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait WorkerThreads extends js.Object {
  def isMainThread: Boolean = js.native

  def parentPort: js.|[MessagePort, Null] = js.native

  def SHARE_ENV: js.Symbol = js.native

  def threadId: Int = js.native

  def workerData: js.Any = js.native

  def moveMessagePortToContext(port: MessagePort, contextifiedSandbox: io.scalajs.nodejs.vm.Context): MessagePort =
    js.native

  def receiveMessageOnPort(port: MessagePort): js.UndefOr[js.Object] = js.native

  def resourceLimits: ResourceLimits = js.native
}

@js.native
@JSImport("worker_threads", JSImport.Namespace)
object WorkerThreads extends WorkerThreads
