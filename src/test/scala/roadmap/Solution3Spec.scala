package roadmap

import org.scalatest.wordspec.AnyWordSpec
import roadmap.question3.Solution

class Solution3Spec extends AnyWordSpec {

  "Question 3" when {
    "presented with scenario with a solution" should {
      "return indices of two numbers such that they add up to the target" in {
        assert(Solution.twoSum(Array(2, 7, 11, 15), 9) === Array(0, 1))
        assert(Solution.twoSum(Array(3, 2, 4), 6) === Array(1, 2))
        assert(Solution.twoSum(Array(3, 3), 6) === Array(0, 1))
      }
    }
    "presented with scenario without a solution" should {
      "throw an exception when solution is not present" in {
        assertThrows[Exception] { Solution.twoSum(Array(3, 2, 4), 10) }
      }
    }
  }
}
