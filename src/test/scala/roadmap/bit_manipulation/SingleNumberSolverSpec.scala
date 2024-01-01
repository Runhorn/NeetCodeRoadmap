package roadmap.bit_manipulation

import org.scalatest.wordspec.AnyWordSpec

class SingleNumberSolverSpec extends AnyWordSpec {

  "SingleNumberSolver" when {
    "presented with non-empty array of integers nums" should {
      "find single element that appears only once" in {
        assert(SingleNumberSolver.solve(Array(2, 2, 1)) === 1)
        assert(SingleNumberSolver.solve(Array(4, 1, 2, 1, 2)) === 4)
        assert(SingleNumberSolver.solve(Array(1)) === 1)
      }
    }
  }
}
