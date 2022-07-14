package io.scalajs.nodejs.events

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/** The Event object is an adaptation of the Event Web API. Instances are created internally by Node.js.
  */
@js.native
trait Event extends js.Object {
  def `type`: String                        = js.native
  def srcElement: EventTarget               = js.native
  def currentTarget: EventTarget            = js.native
  def composedPath(): js.Array[EventTarget] = js.native

  def eventPhase: Int = js.native

  def stopPropagation(): Unit = js.native
  @deprecated("Use stopPropagation", "legacy")
  def cancelBubble: Boolean            = js.native
  def stopImmediatePropagation(): Unit = js.native

  def bubbles: Boolean    = js.native
  def cancelable: Boolean = js.native
  @deprecated("Use returnValue", "legacy")
  def returnValue: Boolean      = js.native
  def preventDefault(): Unit    = js.native
  def defaultPrevented: Boolean = js.native
  def composed: Boolean         = js.native

  def isTrusted: Boolean = js.native
  def timeStamp: Double  = js.native
}

@js.native
@JSGlobal("Event")
object Event extends js.Object {
  val NONE: Int            = js.native
  val CAPTURING_PHASE: Int = js.native
  val AT_TARGET: Int       = js.native
  val BUBBLING_PHASE: Int  = js.native
}

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[Event, Any], options: AddEventListenerOptions): Unit =
    js.native
  def addEventListener(`type`: String, listener: js.Function1[Event, Any]): Unit = js.native

  def dispatchEvent(event: Event): Unit = js.native

  def removeEventListener(`type`: String,
                          listener: js.Function1[Event, Any],
                          options: RemoveEventListenerOptions
  ): Unit = js.native
}

trait AddEventListenerOptions extends js.Object {
  var once: js.UndefOr[Boolean]
  var passive: js.UndefOr[Boolean]
  var capture: js.UndefOr[Boolean]
}
object AddEventListenerOptions {
  def apply(
      once: js.UndefOr[Boolean] = js.undefined,
      passive: js.UndefOr[Boolean] = js.undefined,
      capture: js.UndefOr[Boolean] = js.undefined
  ): AddEventListenerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    once.foreach(_v => _obj$.updateDynamic("once")(_v.asInstanceOf[js.Any]))
    passive.foreach(_v => _obj$.updateDynamic("passive")(_v.asInstanceOf[js.Any]))
    capture.foreach(_v => _obj$.updateDynamic("capture")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[AddEventListenerOptions]
  }
}

trait RemoveEventListenerOptions extends js.Object {
  var capture: js.UndefOr[Boolean]
}
object RemoveEventListenerOptions {
  def apply(
      capture: js.UndefOr[Boolean] = js.undefined
  ): RemoveEventListenerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    capture.foreach(_v => _obj$.updateDynamic("capture")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RemoveEventListenerOptions]
  }
}

@js.native
trait NodeEventTarget extends EventTarget {
  def addListener(`type`: String, listener: js.Function1[Event, Any], options: AddListenerOptions): EventTarget =
    js.native
  def addListener(`type`: String, listener: js.Function1[Event, Any]): EventTarget = js.native

  def eventNames(): js.Array[String] = js.native

  def listenerCount(`type`: String): Int = js.native

  def on(`type`: String, listener: js.Function1[Event, Any], options: AddListenerOptions): EventTarget = js.native
  def on(`type`: String, listener: js.Function1[Event, Any]): EventTarget                              = js.native

  def once(`type`: String, listener: js.Function1[Event, Any]): EventTarget = js.native

  def off(`type`: String, listener: js.Function1[Event, Any]): EventTarget = js.native

  def removeAllListeners(): EventTarget               = js.native
  def removeAllListeners(`type`: String): EventTarget = js.native

  def removeListener(`type`: String, listener: js.Function1[Event, Any]): EventTarget = js.native
}

trait AddListenerOptions extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
}
object AddListenerOptions {
  def apply(
      once: js.UndefOr[Boolean] = js.undefined
  ): AddListenerOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    once.foreach(_v => _obj$.updateDynamic("once")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[AddListenerOptions]
  }
}
