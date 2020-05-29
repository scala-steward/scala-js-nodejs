package io.scalajs.nodejs
package fs

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.url.URL
import org.scalatest.funspec.AnyFunSpec

class FsClassesTest extends AnyFunSpec {
  val dirname = process.Process.cwd()

  describe("ReadStream") {
    it("supports constructor(") {
      assert(new ReadStream("package.json").readableLength === 0)
      assert(new ReadStream(Buffer.from("package.json")) !== null)
      assert(new ReadStream(new URL(s"file:///${dirname}/package.json")) !== null)
    }
  }

  describe("WriteStream") {
    it("supports constructor") {
      assert(new WriteStream("NO_SUCH_FILE").writableLength === 0)
      assert(new WriteStream(Buffer.from("NO_SUCH_FILE")) !== null)
      assert(new WriteStream(new URL(s"file:///${dirname}/NO_SUCH_FILE")) !== null)
    }
  }
}
