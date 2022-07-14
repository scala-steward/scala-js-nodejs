package io.scalajs.nodejs.cluster

import io.scalajs.nodejs.{GID, UID}

import scala.scalajs.js
import scala.scalajs.js.|

/** Cluster Settings
  */
trait ClusterSettings extends js.Object {

  /** <Array> list of string arguments passed to the Node.js executable. (Default=process.execArgv) */
  var execArgv: js.Array[String]

  /** <String> file path to worker file. (Default=process.argv[1]) */
  var exec: String

  /** <Array> string arguments passed to worker. (Default=process.argv.slice(2)) */
  var args: js.Array[String]

  /** <Boolean> whether or not to send output to parent's stdio. (Default=false) */
  var silent: Boolean

  /** Specify the kind of serialization used for sending messages between processes. Possible values are 'json' and
    * 'advanced'. See Advanced Serialization for more details. Default: 'json'.
    *
    * From Node.js v13.2.0, v12.16.0.
    */
  var serialization: js.UndefOr[String]

  /** <Number> Sets the user identity of the process. (See setuid(2).) */
  var uid: UID

  /** <Number> Sets the group identity of the process. (See setgid(2).) */
  var gid: GID

  var stdio: js.Array[js.Any]

  var inspectPort: Int | js.Function

  var cwd: String

  var windowsHide: Boolean
}

object ClusterSettings {
  def apply(
      execArgv: js.Array[String],
      exec: String,
      args: js.Array[String],
      silent: Boolean,
      uid: UID,
      gid: GID,
      stdio: js.Array[js.Any],
      inspectPort: Int | js.Function,
      cwd: String,
      windowsHide: Boolean,
      serialization: js.UndefOr[String] = js.undefined
  ): ClusterSettings = {
    val _obj$ = js.Dynamic.literal(
      "execArgv"      -> execArgv.asInstanceOf[js.Any],
      "exec"          -> exec.asInstanceOf[js.Any],
      "args"          -> args.asInstanceOf[js.Any],
      "silent"        -> silent.asInstanceOf[js.Any],
      "serialization" -> serialization.asInstanceOf[js.Any],
      "uid"           -> uid.asInstanceOf[js.Any],
      "gid"           -> gid.asInstanceOf[js.Any],
      "stdio"         -> stdio.asInstanceOf[js.Any],
      "inspectPort"   -> inspectPort.asInstanceOf[js.Any],
      "cwd"           -> cwd.asInstanceOf[js.Any],
      "windowsHide"   -> windowsHide.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ClusterSettings]
  }
}
