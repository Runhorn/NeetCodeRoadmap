package roadmap.bit_manipulation

import org.scalatest.wordspec.AnyWordSpec

class CountingBitsSolverSpec extends AnyWordSpec {

  "CountingBitsSolver" when {
    "presented with integer n" should {
      "return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i." in {
        assert(CountingBitsSolver.solve(2) sameElements Array(0, 1, 1))
        assert(CountingBitsSolver.solve(5) sameElements Array(0, 1, 1, 2, 1, 2))
      }
    }
  }
}
