package io.scalajs.nodejs.module

import com.thoughtworks.enableIf
import io.scalajs.nodejs.Require

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("module", JSImport.Namespace)
object Module extends Module

@js.native
trait Module extends js.Object {
  var builtinModules: js.Array[String] = js.native

  def createRequire(filename: String): Require = js.native

  def createRequire(filename: io.scalajs.nodejs.url.URL): Require = js.native

  def syncBuiltinESMExports(): Unit = js.native

  @deprecated("Use createRequire", "Node.js v12.2.0")
  def createRequireFromPath(filename: String): Require = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def findSourceMap(path: String): SourceMap = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def findSourceMap(path: String, error: io.scalajs.nodejs.Error): SourceMap = js.native
}
