package io.scalajs.nodejs.perf_hooks

import org.scalatest.funspec.AnyFunSpec

class PerfHooksTest extends AnyFunSpec {
  describe("PerfHook") {
    it("constants") {
      assert(PerfHooks.constants.NODE_PERFORMANCE_GC_MAJOR === 2)
    }
  }
}
