package io.scalajs.nodejs.fs

import io.scalajs.nodejs.{fs, process}
import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.url.URL
import org.scalatest.funspec.AnyFunSpec

import scala.scalajs.js.JavaScriptException

class FsClassesTest extends AnyFunSpec {
  val dirname = process.Process.cwd()

  describe("ReadStream") {
    it("supports pending added in v11.2.0") {
      assert(new ReadStream("package.json").pending)
    }
    it("supports constructor(") {
      assert(new ReadStream("package.json").readableLength === 0)
      assert(new ReadStream(Buffer.from("package.json")) !== null)
      assert(new ReadStream(new URL(s"file:///${dirname}/package.json")) !== null)
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

  describe("WriteStream") {
    it("supports constructor") {
      assert(new WriteStream("NO_SUCH_FILE").writableLength === 0)
      assert(new WriteStream(Buffer.from("NO_SUCH_FILE")) !== null)
      assert(new WriteStream(new URL(s"file:///${dirname}/NO_SUCH_FILE")) !== null)
    }
  }
}
