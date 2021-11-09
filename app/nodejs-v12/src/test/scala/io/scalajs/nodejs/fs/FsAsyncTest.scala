package io.scalajs.nodejs.fs

import org.scalatest.BeforeAndAfterEach

import scala.concurrent.ExecutionContext
import org.scalatest.funspec.AsyncFunSpec

import scala.scalajs.js.JavaScriptException

class FsAsyncTest extends AsyncFunSpec with BeforeAndAfterEach {
  override implicit val executionContext = ExecutionContext.Implicits.global

  private val dir = "x.FsAsyncTest/foo/bar"

  override def afterEach(): Unit = {
    Seq(
      "x.FsAsyncTest/foo/bar",
      "x.FsAsyncTest/foo",
      "x.FsAsyncTest"
    ).foreach { d =>
      if (Fs.existsSync(d)) Fs.rmdirSync(d)
    }
  }

  describe("Fs") {
    it("should support recursive-rmdir") {
      for {
        dirExistsBeforeMkdir <- Fs.existsFuture(dir)
        _                    <- Fs.mkdirFuture(dir, MkdirOptions(recursive = true))
        _                    <- Fs.writeFileFuture("x.FsAsyncTest/hoge.txt", "foo")
        fileStat             <- Fs.statFuture("x.FsAsyncTest/hoge.txt")
        dirStat              <- Fs.statFuture(dir)
        dirExistsAfterMkdir  <- Fs.existsFuture(dir)
        _                    <- Fs.rmdirFuture("x.FsAsyncTest", RmdirOptions(recursive = true))
        dirExistsAfterRmdir  <- Fs.existsFuture("x.FsAsyncTest")
      } yield {
        assert(!dirExistsBeforeMkdir)
        assert(fileStat.isFile())
        assert(dirStat.isDirectory())
        assert(dirExistsAfterMkdir)
        assert(!dirExistsAfterRmdir)
      }
    }

    it("should have alias for recursive-rmdir") {
      for {
        dirExistsBeforeMkdir <- Fs.existsFuture(dir)
        _                    <- Fs.mkdirRecursiveFuture(dir)
        dirExistsAfterMkdir  <- Fs.existsFuture(dir)
        _                    <- Fs.rmdirRecursiveFuture("x.FsAsyncTest")
        dirExistsAfterRmdir  <- Fs.existsFuture("x.FsAsyncTest")
      } yield {
        assert(!dirExistsBeforeMkdir)
        assert(dirExistsAfterMkdir)
        assert(!dirExistsAfterRmdir)
      }
    }

    it("support opendir") {
      for {
        dir              <- Fs.opendirFuture("core/src")
        maybeFirstEntry  <- dir.readFuture()
        maybeSecondEntry <- dir.readFuture()
        _                <- dir.closeFuture()
      } yield {
        assert(dir.path === "core/src")
        assert(maybeFirstEntry.map(_.name) === Some("main"))
        assert(maybeSecondEntry === None)

        val ex = intercept[JavaScriptException] {
          assert(dir.readSync() === null)
        }
        assert(ex.getMessage().contains("ERR_DIR_CLOSED"))
      }
    }

    it("should support recursive-mkdir") {
      for {
        dirExistsBeforeMkdir <- Fs.existsFuture(dir)
        _                    <- Fs.mkdirFuture(dir, MkdirOptions(recursive = true))
        dirStat              <- Fs.statFuture(dir)
        dirExistsAfterMkdir  <- Fs.existsFuture(dir)
      } yield {
        assert(!dirExistsBeforeMkdir)
        assert(dirStat.isDirectory())
        assert(dirExistsAfterMkdir)
      }
    }

    it("should have alias for recursive-mkdir") {
      for {
        dirExistsBeforeMkdir <- Fs.existsFuture(dir)
        _                    <- Fs.mkdirRecursiveFuture(dir)
        dirStat              <- Fs.statFuture(dir)
        dirExistsAfterMkdir  <- Fs.existsFuture(dir)
      } yield {
        assert(!dirExistsBeforeMkdir)
        assert(dirStat.isDirectory())
        assert(dirExistsAfterMkdir)
      }
    }
  }
}
