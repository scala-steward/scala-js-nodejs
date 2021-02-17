package io.scalajs.nodejs.fs

import io.scalajs.nodejs.fs
import org.scalatest.funspec.AnyFunSpec

import scala.scalajs.js.JavaScriptException

/** File System (Fs) Tests
  */
class FsClassesTest extends AnyFunSpec {
  describe("ReadStream") {
    it("supports pending added in v11.2.0") {
      assert(new ReadStream("package.json").pending)
    }
  }

  describe("opendir") {
    it("returns Dir") {
      val dir = fs.Fs.opendirSync("core/src")
      assert(dir.path === "core/src")
      val firstEntry = dir.readSync()
      assert(firstEntry.name === "main")
      assert(firstEntry.isDirectory())

      assert(dir.readSync() === null)

      dir.closeSync()
      val ex = intercept[JavaScriptException] {
        assert(dir.readSync() === null)
      }
      assert(ex.getMessage().contains("ERR_DIR_CLOSED"))
    }
  }

  it("adds new members on bigint stats") {
    val stats = Fs.statSync("./package.json", StatOptions(bigint = true)).asInstanceOf[BigIntStats]
    assert(stats.asInstanceOf[BigIntStats].birthtimeNs.toString.toLong > 0L)
    assert(stats.asInstanceOf[BigIntStats].ctimeNs.toString.toLong > 0L)
    assert(stats.asInstanceOf[BigIntStats].atimeNs.toString.toLong > 0L)
    assert(stats.asInstanceOf[BigIntStats].mtimeNs.toString.toLong > 0L)
  }
}
