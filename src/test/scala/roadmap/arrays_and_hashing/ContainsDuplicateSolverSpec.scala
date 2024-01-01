package roadmap.arrays_and_hashing

import org.scalatest.wordspec.AnyWordSpec

class ContainsDuplicateSolverSpec extends AnyWordSpec {

  "ContainsDuplicateSolver" when {
    "presented with duplicates" should {
      "detect duplicates" in {
        assert(
          ContainsDuplicateSolver.solve(
            Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
          ) === true
        )
      }
    }
    "presented with distinct values" should {
      "not detect duplicates" in {
        assert(ContainsDuplicateSolver.solve(Array(1, 2, 3, 4)) === false)
      }
    }
  }
}
