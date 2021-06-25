package io.scalajs.nodejs

import io.scalajs.nodejs.events.EventTarget

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("AbortController")
class AbortController extends js.Object {
  def abort(): Unit       = js.native
  def signal: AbortSignal = js.native
}

@js.native
@JSGlobal("AbortSignal")
class AbortSignal private[this] () extends EventTarget {
  def aborted: Boolean = js.native
}

@js.native
@JSGlobal("AbortSignal")
object AbortSignal extends js.Object {
  def abort(): AbortSignal = js.native
}
