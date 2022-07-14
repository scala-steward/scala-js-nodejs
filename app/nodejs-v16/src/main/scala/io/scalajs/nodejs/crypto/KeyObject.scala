package io.scalajs.nodejs.crypto

import io.scalajs.nodejs.buffer.Buffer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{DataView, TypedArray}
import scala.scalajs.js.|

@js.native
@JSImport("crypto", "KeyObject")
class KeyObject(`type_`: String, handle: js.Object) extends js.Object {
  def `export`(options: KeyObjectExportOptions): Buffer | String = js.native
  def `export`(): Buffer                                         = js.native

  /** For asymmetric keys, this property represents the type of the key. This property is undefined for unrecognized
    * KeyObject types and symmetric keys.
    */
  val asymmetricKeyType: js.UndefOr[String] = js.native

  /** For secret keys, this property represents the size of the key in bytes. This property is undefined for asymmetric
    * keys.
    */
  val symmetricKeySize: js.UndefOr[Int] = js.native

  /** Depending on the type of this KeyObject, this property is either 'secret' for secret (symmetric) keys, 'public'
    * for public (asymmetric) keys or 'private' for private (asymmetric) keys.
    */
  val `type`: String = js.native
}

trait KeyObjectExportOptions extends js.Object {
  var `type`: js.UndefOr[String]              = js.undefined
  var format: js.UndefOr[String]              = js.undefined
  var cipher: js.UndefOr[String]              = js.undefined
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
}
object KeyObjectExportOptions {
  def apply(
      `type`: js.UndefOr[String] = js.undefined,
      format: js.UndefOr[String] = js.undefined,
      cipher: js.UndefOr[String] = js.undefined,
      passphrase: js.UndefOr[String | Buffer] = js.undefined
  ): KeyObjectExportOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    `type`.foreach(_v => _obj$.updateDynamic("type")(_v.asInstanceOf[js.Any]))
    format.foreach(_v => _obj$.updateDynamic("format")(_v.asInstanceOf[js.Any]))
    cipher.foreach(_v => _obj$.updateDynamic("cipher")(_v.asInstanceOf[js.Any]))
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[KeyObjectExportOptions]
  }
}

trait PublicEncryptKeyObject extends js.Object {
  var key: String | Buffer | KeyObject
  var oaepHash: js.UndefOr[String]                                = js.undefined
  var oaepLabel: js.UndefOr[Buffer | TypedArray[_, _] | DataView] = js.undefined
  var passphrase: js.UndefOr[String | Buffer]                     = js.undefined
  var padding: js.UndefOr[Int]                                    = js.undefined
}

object PublicEncryptKeyObject {
  def apply(
      key: String | Buffer | KeyObject,
      oaepHash: js.UndefOr[String] = js.undefined,
      oaepLabel: js.UndefOr[Buffer | TypedArray[_, _] | js.typedarray.DataView] = js.undefined,
      passphrase: js.UndefOr[String | Buffer] = js.undefined,
      padding: js.UndefOr[Int] = js.undefined
  ): PublicEncryptKeyObject = {
    val _obj$ = js.Dynamic.literal(
      "key" -> key.asInstanceOf[js.Any]
    )
    oaepHash.foreach(_v => _obj$.updateDynamic("oaepHash")(_v.asInstanceOf[js.Any]))
    oaepLabel.foreach(_v => _obj$.updateDynamic("oaepLabel")(_v.asInstanceOf[js.Any]))
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    padding.foreach(_v => _obj$.updateDynamic("padding")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PublicEncryptKeyObject]
  }
}

trait PublicDecryptKeyObject extends js.Object {
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
  var padding: js.UndefOr[Int]                = js.undefined
}
object PublicDecryptKeyObject {
  def apply(
      passphrase: js.UndefOr[String | Buffer] = js.undefined,
      padding: js.UndefOr[Int] = js.undefined
  ): PublicDecryptKeyObject = {
    val _obj$ = js.Dynamic.literal(
    )
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    padding.foreach(_v => _obj$.updateDynamic("padding")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PublicDecryptKeyObject]
  }
}

trait PrivateEncryptKeyObject extends js.Object {
  var key: String | Buffer | KeyObject
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
  var padding: js.UndefOr[Int]                = js.undefined
}
object PrivateEncryptKeyObject {
  def apply(
      key: String | Buffer | KeyObject,
      passphrase: js.UndefOr[String | Buffer] = js.undefined,
      padding: js.UndefOr[Int] = js.undefined
  ): PrivateEncryptKeyObject = {
    val _obj$ = js.Dynamic.literal(
      "key" -> key.asInstanceOf[js.Any]
    )
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    padding.foreach(_v => _obj$.updateDynamic("padding")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PrivateEncryptKeyObject]
  }
}

trait PrivateDecryptKeyObject extends js.Object {
  var oaepHash: js.UndefOr[String]                                = js.undefined
  var oaepLabel: js.UndefOr[Buffer | TypedArray[_, _] | DataView] = js.undefined
  var padding: js.UndefOr[Int]                                    = js.undefined
}

object PrivateDecryptKeyObject {
  def apply(
      oaepHash: js.UndefOr[String] = js.undefined,
      oaepLabel: js.UndefOr[Buffer | TypedArray[_, _] | js.typedarray.DataView] = js.undefined,
      padding: js.UndefOr[Int] = js.undefined
  ): PrivateDecryptKeyObject = {
    val _obj$ = js.Dynamic.literal(
    )
    oaepHash.foreach(_v => _obj$.updateDynamic("oaepHash")(_v.asInstanceOf[js.Any]))
    oaepLabel.foreach(_v => _obj$.updateDynamic("oaepLabel")(_v.asInstanceOf[js.Any]))
    padding.foreach(_v => _obj$.updateDynamic("padding")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PrivateDecryptKeyObject]
  }
}
