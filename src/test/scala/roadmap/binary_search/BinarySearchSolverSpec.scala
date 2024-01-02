package roadmap.binary_search

import org.scalatest.wordspec.AnyWordSpec

class BinarySearchSolverSpec extends AnyWordSpec {

  "BinarySearchSolver" when {
    "Given an array of integers nums which is sorted in ascending order, and an integer target" should {
      "return target index or -1" in {
        assert(
          BinarySearchSolver.solve(Array(-1, 0, 3, 5, 9, 12), target = 9) === 4
        )
      }
      "return -1" in {
        assert(
          BinarySearchSolver.solve(Array(-1, 0, 3, 5, 9, 12), target = 2) === -1
        )
      }
    }
  }
}
