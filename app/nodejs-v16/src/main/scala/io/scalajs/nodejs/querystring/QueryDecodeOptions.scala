package io.scalajs.nodejs.querystring

import scala.scalajs.js

trait QueryDecodeOptions extends js.Object {

  /** The function to use when decoding percent-encoded characters in the query string. Defaults to
    * querystring.unescape().
    */
  var decodeURIComponent: js.UndefOr[js.Function] = js.undefined

  /** Specifies the maximum number of keys to parse. Defaults to 1000. Specify 0 to remove key counting limitations. The
    * querystring.parse() method parses a URL query string into a collection of key and value pairs.
    */
  var maxKeys: js.UndefOr[Int] = js.undefined
}

object QueryDecodeOptions {
  def apply(
      decodeURIComponent: js.UndefOr[js.Function] = js.undefined,
      maxKeys: js.UndefOr[Int] = js.undefined
  ): QueryDecodeOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    decodeURIComponent.foreach(_v => _obj$.updateDynamic("decodeURIComponent")(_v.asInstanceOf[js.Any]))
    maxKeys.foreach(_v => _obj$.updateDynamic("maxKeys")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[QueryDecodeOptions]
  }
}
