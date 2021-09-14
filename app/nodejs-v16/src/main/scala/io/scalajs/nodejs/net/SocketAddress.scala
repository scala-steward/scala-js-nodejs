package io.scalajs.nodejs.net

import com.thoughtworks.enableMembersIf
import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("net", "SocketAddress")
@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
class SocketAddress(options: SocketAddressOptions) extends js.Object {
  def this() = this(null)

  var address: String = js.native
  var family: String  = js.native
  var flowlabel: Int  = js.native
  var port: Int       = js.native
}

@Factory
trait SocketAddressOptions extends js.Object {
  var address: js.UndefOr[String]
  var family: js.UndefOr[String]
  var flowlabel: js.UndefOr[Int]
  var port: js.UndefOr[Int]
}
