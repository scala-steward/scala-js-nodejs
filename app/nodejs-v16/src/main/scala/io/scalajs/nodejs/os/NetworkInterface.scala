package io.scalajs.nodejs.os

import scala.scalajs.js

/** Represents a Network Interface
  */
trait NetworkInterface extends js.Object {
  var address: String
  var netmask: String
  var family: String
  var mac: String
  var scopeid: js.UndefOr[Int] = js.undefined
  var internal: Boolean
}
object NetworkInterface {
  def apply(
      address: String,
      netmask: String,
      family: String,
      mac: String,
      internal: Boolean,
      scopeid: js.UndefOr[Int] = js.undefined
  ): NetworkInterface = {
    val _obj$ = js.Dynamic.literal(
      "address"  -> address.asInstanceOf[js.Any],
      "netmask"  -> netmask.asInstanceOf[js.Any],
      "family"   -> family.asInstanceOf[js.Any],
      "mac"      -> mac.asInstanceOf[js.Any],
      "internal" -> internal.asInstanceOf[js.Any]
    )
    scopeid.foreach(_v => _obj$.updateDynamic("scopeid")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[NetworkInterface]
  }
}
