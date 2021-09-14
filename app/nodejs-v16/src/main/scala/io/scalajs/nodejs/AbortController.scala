package io.scalajs.nodejs

import com.thoughtworks.enableMembersIf
import io.scalajs.nodejs.events.EventTarget

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
@JSGlobal("AbortController")
class AbortController extends js.Object {
  def abort(): Unit       = js.native
  def signal: AbortSignal = js.native
}

@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
@JSGlobal("AbortSignal")
class AbortSignal private[this] () extends EventTarget {
  def aborted: Boolean = js.native
}

@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
@JSGlobal("AbortSignal")
object AbortSignal extends js.Object {
  def abort(): AbortSignal = js.native
}
