package io.scalajs.nodejs.os

import scala.scalajs.js

trait UserInfoOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var shell: js.UndefOr[String]    = js.undefined
  var homedir: js.UndefOr[String]  = js.undefined
}
object UserInfoOptions {
  def apply(
      encoding: js.UndefOr[String] = js.undefined,
      username: js.UndefOr[String] = js.undefined,
      shell: js.UndefOr[String] = js.undefined,
      homedir: js.UndefOr[String] = js.undefined
  ): UserInfoOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    encoding.foreach(_v => _obj$.updateDynamic("encoding")(_v.asInstanceOf[js.Any]))
    username.foreach(_v => _obj$.updateDynamic("username")(_v.asInstanceOf[js.Any]))
    shell.foreach(_v => _obj$.updateDynamic("shell")(_v.asInstanceOf[js.Any]))
    homedir.foreach(_v => _obj$.updateDynamic("homedir")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[UserInfoOptions]
  }
}
