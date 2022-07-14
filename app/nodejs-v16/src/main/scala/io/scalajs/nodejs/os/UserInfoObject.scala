package io.scalajs.nodejs.os

import io.scalajs.nodejs.{GID, UID}

import scala.scalajs.js

/** User Information Object
  * @example
  *   {{{{"uid":501,"gid":20,"username":"ldaniels","homedir":"/Users/ldaniels","shell":"/bin/bash"}}} }
  */
trait UserInfoObject extends js.Object {
  var uid: UID
  var gid: GID
  var username: String
  var homedir: String
  var shell: String
}

object UserInfoObject {
  def apply(
      uid: UID,
      gid: GID,
      username: String,
      homedir: String,
      shell: String
  ): UserInfoObject = {
    val _obj$ = js.Dynamic.literal(
      "uid"      -> uid.asInstanceOf[js.Any],
      "gid"      -> gid.asInstanceOf[js.Any],
      "username" -> username.asInstanceOf[js.Any],
      "homedir"  -> homedir.asInstanceOf[js.Any],
      "shell"    -> shell.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[UserInfoObject]
  }
}
