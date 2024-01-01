package roadmap

import org.scalatest.wordspec.AnyWordSpec
import roadmap.question2.Solution

class Solution2Spec extends AnyWordSpec {

  "Question 2" when {
    "presented with anagram" should {
      "detect anagram" in {
        assert(Solution.isAnagram("anagram", "nagaram") === true)
      }
    }
    "presented with distinct values" should {
      "not detect anagram" in {
        assert(Solution.isAnagram("rat", "car") === false)
      }
    }
  }
}