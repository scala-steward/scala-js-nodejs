package io.scalajs.nodejs.stream

import io.scalajs.nodejs.fs
import io.scalajs.nodejs.fs.Fs
import io.scalajs.nodejs.zlib
import org.scalatest.BeforeAndAfterEach
import org.scalatest.funspec.AnyFunSpec

import scala.scalajs.js

class StreamTest extends AnyFunSpec with BeforeAndAfterEach {
  override def afterEach(): Unit = {
    Seq(
      "package.json.gz"
    ).foreach { d =>
      if (Fs.existsSync(d)) Fs.unlinkSync(d)
    }
  }

  describe("Stream") {
    it("pipeline should return the stream which have same type of destination") {
      val result = Stream.pipeline(
        fs.Fs.createReadStream("package.json"),
        zlib.Zlib.createGzip(),
        fs.Fs.createWriteStream("package.json.gz"),
        err => {
          assert(err === js.undefined)
        }
      )
      assert(result.isInstanceOf[Writable])
    }
  }

  describe("StreamModuleExtensions") {
    it("pipelineFromSeq should return the stream which have same type of destination") {
      val result = Stream.pipelineFromSeq(
        fs.Fs.createReadStream("package.json"),
        Seq(zlib.Zlib.createGzip()),
        fs.Fs.createWriteStream("package.json.gz"),
        err => {
          assert(err === js.undefined)
        }
      )
      assert(result.isInstanceOf[Writable])
    }
  }
}
