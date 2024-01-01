package roadmap.two_pointers

import org.scalatest.wordspec.AnyWordSpec

class ValidPalindromeSolverSpec extends AnyWordSpec {

  "ValidPalindromeSolver" when {
    "presented with a palindrome string" should {
      "detect a palindrome" in {
        assert(
          ValidPalindromeSolver.solve("A man, a plan, a canal: Panama") === true
        )
      }
    }
    "presented with non palindrome string" should {
      "not detect palindrome" in {
        assert(ValidPalindromeSolver.solve("race a car") === false)
      }
    }
    "presented with empty string" should {
      "treat it as a palindrome" in {
        assert(ValidPalindromeSolver.solve(" ") === true)
      }
    }
  }
}
