package io.scalajs.nodejs.net

import com.thoughtworks.enableMembersIf

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

trait SocketAddressOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String]  = js.undefined
  var flowlabel: js.UndefOr[Int]  = js.undefined
  var port: js.UndefOr[Int]       = js.undefined
}
object SocketAddressOptions {
  def apply(
      address: js.UndefOr[String] = js.undefined,
      family: js.UndefOr[String] = js.undefined,
      flowlabel: js.UndefOr[Int] = js.undefined,
      port: js.UndefOr[Int] = js.undefined
  ): SocketAddressOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    address.foreach(_v => _obj$.updateDynamic("address")(_v.asInstanceOf[js.Any]))
    family.foreach(_v => _obj$.updateDynamic("family")(_v.asInstanceOf[js.Any]))
    flowlabel.foreach(_v => _obj$.updateDynamic("flowlabel")(_v.asInstanceOf[js.Any]))
    port.foreach(_v => _obj$.updateDynamic("port")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SocketAddressOptions]
  }
}
