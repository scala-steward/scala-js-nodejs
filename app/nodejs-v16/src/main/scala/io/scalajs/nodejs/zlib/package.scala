package io.scalajs.nodejs

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Future
import scala.scalajs.js.typedarray.{ArrayBuffer, DataView, TypedArray}
import scala.scalajs.js.|

/** zlib package object
  */
package object zlib {
  type Data                  = String | TypedArray[_, _] | DataView | ArrayBuffer
  type AllocationType        = Int
  type CompressionFlush      = Int
  type CompressionFunction   = Int
  type CompressionLevel      = Int
  type CompressionStrategy   = Int
  type DataType              = Int
  type DeflateCompressMethod = Int

  /** Zlib Extensions
    */
  implicit final class ZlibExtensions[T <: Zlib](private val zlib: T) extends AnyVal {

    @inline
    def deflateFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.deflate(buffer, options, _))
    }

    @inline
    def deflateFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.deflate(buffer, _))
    }

    @inline
    def deflateRawFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.deflateRaw(buffer, options, _))
    }

    @inline
    def deflateRawFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.deflateRaw(buffer, _))
    }

    @inline
    def gzipFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.gzip(buffer, options, _))
    }

    @inline
    def gzipFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.gzip(buffer, _))
    }

    @inline
    def gunzipFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.gunzip(buffer, options, _))
    }

    @inline
    def gunzipFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.gunzip(buffer, _))
    }

    @inline
    def inflateFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.inflate(buffer, options, _))
    }

    @inline
    def inflateFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.inflate(buffer, _))
    }

    @inline
    def inflateRawFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.inflateRaw(buffer, options, _))
    }

    @inline
    def inflateRawFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.inflateRaw(buffer, _))
    }

    @inline
    def unzipFuture(buffer: Data, options: CompressionOptions): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.unzip(buffer, options, _))
    }

    @inline
    def unzipFuture(buffer: Data): Future[Buffer] = {
      promiseWithError1[Error, Buffer](zlib.unzip(buffer, _))
    }
  }
}
