package io.scalajs.nodejs.module

import com.thoughtworks.enableMembersIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
@JSImport("module", "SourceMap")
class SourceMap(payload: SourceMapPayload) extends js.Object {
  def payload: SourceMapPayload                                     = js.native
  def findEntry(lineNumber: Int, columnNumber: Int): SourceMapEntry = js.native
}

trait SourceMapPayload extends js.Object {
  var file: String
  var version: Double
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
  var names: js.Array[String]
  var mappings: String
  var sourceRoot: String
}

object SourceMapPayload {
  def apply(
      file: String,
      version: Double,
      sources: js.Array[String],
      sourcesContent: js.Array[String],
      names: js.Array[String],
      mappings: String,
      sourceRoot: String
  ): SourceMapPayload = {
    val _obj$ = js.Dynamic.literal(
      "file"           -> file.asInstanceOf[js.Any],
      "version"        -> version.asInstanceOf[js.Any],
      "sources"        -> sources.asInstanceOf[js.Any],
      "sourcesContent" -> sourcesContent.asInstanceOf[js.Any],
      "names"          -> names.asInstanceOf[js.Any],
      "mappings"       -> mappings.asInstanceOf[js.Any],
      "sourceRoot"     -> sourceRoot.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SourceMapPayload]
  }
}

trait SourceMapEntry extends js.Object {
  var generatedLine: Int
  var generatedColumn: Int
  var originalSource: String
  var originalLine: Int
  var originalColumn: Int
}
object SourceMapEntry {
  def apply(
      generatedLine: Int,
      generatedColumn: Int,
      originalSource: String,
      originalLine: Int,
      originalColumn: Int
  ): SourceMapEntry = {
    val _obj$ = js.Dynamic.literal(
      "generatedLine"   -> generatedLine.asInstanceOf[js.Any],
      "generatedColumn" -> generatedColumn.asInstanceOf[js.Any],
      "originalSource"  -> originalSource.asInstanceOf[js.Any],
      "originalLine"    -> originalLine.asInstanceOf[js.Any],
      "originalColumn"  -> originalColumn.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SourceMapEntry]
  }
}
