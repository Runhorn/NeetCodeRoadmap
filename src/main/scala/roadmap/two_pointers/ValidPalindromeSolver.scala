package roadmap.two_pointers

/** https://leetcode.com/problems/valid-palindrome/
  */

object ValidPalindromeSolver {
  def solve(s: String): Boolean = {
    val replacedString = s.trim.toLowerCase.replaceAll("[^a-z0-9]", "")
    replacedString.reverse == replacedString
  }
}
