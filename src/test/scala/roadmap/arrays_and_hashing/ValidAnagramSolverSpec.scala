package roadmap.arrays_and_hashing

import org.scalatest.wordspec.AnyWordSpec

class ValidAnagramSolverSpec extends AnyWordSpec {

  "ValidAnagramSolver" when {
    "presented with anagram" should {
      "detect anagram" in {
        assert(ValidAnagramSolver.solve("anagram", "nagaram") === true)
      }
    }
    "presented with distinct values" should {
      "not detect anagram" in {
        assert(ValidAnagramSolver.solve("rat", "car") === false)
      }
    }
  }
}
