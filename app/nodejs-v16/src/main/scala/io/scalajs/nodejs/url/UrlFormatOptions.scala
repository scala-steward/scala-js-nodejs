package io.scalajs.nodejs.url

import scala.scalajs.js

trait UrlFormatOptions extends js.Object {

  /** true if the serialized URL string should include the username and password, false otherwise. Defaults to true.
    */
  var auth: js.UndefOr[Boolean] = js.undefined

  /** true if the serialized URL string should include the fragment, false otherwise. Defaults to true.
    */
  var fragment: js.UndefOr[Boolean] = js.undefined

  /** true if the serialized URL string should include the search query, false otherwise. Defaults to true.
    */
  var search: js.UndefOr[Boolean] = js.undefined

  /** true if Unicode characters appearing in the host component of the URL string should be encoded directly as opposed
    * to being Punycode encoded. Defaults to false.
    */
  var unicode: js.UndefOr[Boolean] = js.undefined
}

object UrlFormatOptions {
  def apply(
      auth: js.UndefOr[Boolean] = js.undefined,
      fragment: js.UndefOr[Boolean] = js.undefined,
      search: js.UndefOr[Boolean] = js.undefined,
      unicode: js.UndefOr[Boolean] = js.undefined
  ): UrlFormatOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    auth.foreach(_v => _obj$.updateDynamic("auth")(_v.asInstanceOf[js.Any]))
    fragment.foreach(_v => _obj$.updateDynamic("fragment")(_v.asInstanceOf[js.Any]))
    search.foreach(_v => _obj$.updateDynamic("search")(_v.asInstanceOf[js.Any]))
    unicode.foreach(_v => _obj$.updateDynamic("unicode")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[UrlFormatOptions]
  }
}
