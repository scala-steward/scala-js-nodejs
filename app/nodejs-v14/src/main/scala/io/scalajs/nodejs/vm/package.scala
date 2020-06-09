package io.scalajs.nodejs

import scala.scalajs.js

package object vm {
  type Context = js.Object
  @deprecated("Use js.Object instead", "v0.12.0")
  type ScriptContext = js.Object
}
