package io.scalajs.nodejs

import io.scalajs.nodejs
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.typedarray.{DataView, TypedArray}
import scala.scalajs.js.|

package object child_process {
  type Output = nodejs.buffer.Buffer | String
  type Input  = String | nodejs.buffer.Buffer | TypedArray[_, _] | DataView
  type StdIo = String | js.Array[String] | js.Array[io.scalajs.nodejs.FileDescriptor] | js.Array[
    String | io.scalajs.nodejs.FileDescriptor
  ]
  type KillSignal   = Int | String
  type ExecCallback = js.Function3[nodejs.Error, Output, Output, Any]

  implicit final class ChildProcessObjectExtensions(private val cp: ChildProcess.type) extends AnyVal {
    @inline
    def execFuture(command: String, options: ExecOptions): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.exec(command, options, _))
    }

    @inline
    def execFuture(command: String): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.exec(command, _))
    }

    @inline
    def execFileFuture(file: String, args: js.Array[String], options: ExecOptions): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.execFile(file, args, options, _))
    }

    @inline
    def execFileFuture(file: String, args: js.Array[String]): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.execFile(file, args, _))
    }

    @inline
    def execFileFuture(file: String, options: ExecOptions): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.execFile(file, options, _))
    }

    @inline
    def execFileFuture(file: String): Future[(Output, Output)] = {
      promiseWithError2[nodejs.Error, Output, Output](cp.execFile(file, _))
    }
  }

  implicit final class ChildProcessExtensions(private val cp: ChildProcess) extends AnyVal {
    @inline
    def onClose(listener: (Int, String) => Any): ChildProcess = cp.on("close", listener)

    @inline
    def onDisconnect(listener: () => Any): ChildProcess = cp.on("disconnect", listener)

    @inline
    def onError(listener: (js.Error) => Any): ChildProcess = cp.on("error", listener)

    @inline
    def onMessage(listener: (js.Any, js.UndefOr[net.Socket | net.Server]) => Any): ChildProcess =
      cp.on("message", listener)
  }
}
