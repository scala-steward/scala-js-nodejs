package io.scalajs.nodejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait Require extends js.Object {
  def apply(id: String): js.Any = js.native

  val cache: js.Dictionary[js.Any] = js.native
  val main: js.UndefOr[Module]     = js.native
  val resolve: RequireResolver     = js.native
}

@js.native
@JSGlobal("require")
object Require extends Require

@js.native
trait RequireResolver extends js.Object {
  def apply(request: String, options: ResolveOptions): js.Any = js.native
  def apply(request: String): js.Any                          = js.native

  def paths(requiest: String): js.Array[String] = js.native
}

trait ResolveOptions extends js.Object {
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object ResolveOptions {
  def apply(
      paths: js.UndefOr[js.Array[String]] = js.undefined
  ): ResolveOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    paths.foreach(_v => _obj$.updateDynamic("paths")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ResolveOptions]
  }
}
