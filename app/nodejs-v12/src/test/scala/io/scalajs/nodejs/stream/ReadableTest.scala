package io.scalajs.nodejs.stream

import io.scalajs.nodejs.fs.ReadStream
import org.scalatest.funspec.AnyFunSpec

class ReadableTest extends AnyFunSpec {
  describe("Readable") {
    it("readableEncoding") {
      assert(new ReadStream("package.json").readableEncoding === null)
    }

    it("readableFlowing") {
      val rs = new ReadStream("package.json")
      assert(rs.readableFlowing === null)
      rs.on("readable", () => {})
      assert(rs.readableFlowing === false)
    }
  }
}
