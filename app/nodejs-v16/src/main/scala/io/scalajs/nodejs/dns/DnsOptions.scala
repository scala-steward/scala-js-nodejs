package io.scalajs.nodejs.dns

import scala.scalajs.js

trait DnsOptions extends js.Object {
  var family: js.UndefOr[Int]       = js.undefined
  var hints: js.UndefOr[Int]        = js.undefined
  var all: js.UndefOr[Boolean]      = js.undefined
  var verbatim: js.UndefOr[Boolean] = js.undefined
}
object DnsOptions {
  def apply(
      family: js.UndefOr[Int] = js.undefined,
      hints: js.UndefOr[Int] = js.undefined,
      all: js.UndefOr[Boolean] = js.undefined,
      verbatim: js.UndefOr[Boolean] = js.undefined
  ): DnsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    family.foreach(_v => _obj$.updateDynamic("family")(_v.asInstanceOf[js.Any]))
    hints.foreach(_v => _obj$.updateDynamic("hints")(_v.asInstanceOf[js.Any]))
    all.foreach(_v => _obj$.updateDynamic("all")(_v.asInstanceOf[js.Any]))
    verbatim.foreach(_v => _obj$.updateDynamic("verbatim")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[DnsOptions]
  }
}
