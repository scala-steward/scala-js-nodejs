package io.scalajs.nodejs.perf_hooks

import org.scalatest.funspec.AnyFunSpec
import scala.scalajs.js

class PerformanceObserverTest extends AnyFunSpec {
  describe("PerformanceObserver") {
    it("callback should be when new entry added to the performance timeline") {
      var called = false
      val instance = new PerformanceObserver((_, observer) => {
        called = true
        observer.disconnect()
      })
      instance.observe(
        ObserveOptions(
          entryTypes = js.Array("mark")
        )
      )
      Performance.mark("test")

      assert(called)
    }
  }
}
