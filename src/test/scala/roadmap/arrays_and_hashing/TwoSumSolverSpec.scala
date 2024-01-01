package roadmap.arrays_and_hashing

import org.scalatest.wordspec.AnyWordSpec

class TwoSumSolverSpec extends AnyWordSpec {

  "TwoSumSolver" when {
    "presented with scenario with a solution" should {
      "return indices of two numbers such that they add up to the target" in {
        assert(TwoSumSolver.solve(Array(2, 7, 11, 15), 9) === Array(0, 1))
        assert(TwoSumSolver.solve(Array(3, 2, 4), 6) === Array(1, 2))
        assert(TwoSumSolver.solve(Array(3, 3), 6) === Array(0, 1))
      }
    }
    "presented with scenario without a solution" should {
      "throw an exception when solution is not present" in {
        assertThrows[Exception] { TwoSumSolver.solve(Array(3, 2, 4), 10) }
      }
    }
  }
}
