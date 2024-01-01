package roadmap

import org.scalatest.wordspec.AnyWordSpec
import roadmap.question1.Solution

class Solution1Spec extends AnyWordSpec {

  "Question 1" when {
    "presented with duplicates" should {
      "detect duplicates" in {
        assert(
          Solution.containsDuplicate(
            Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
          ) === true
        )
      }
    }
    "presented with distinct values" should {
      "not detect duplicates" in {
        assert(Solution.containsDuplicate(Array(1, 2, 3, 4)) === false)
      }
    }
  }
}
