package roadmap.arrays_and_hashing

/** https://leetcode.com/problems/valid-anagram/submissions/ Given two strings s
  * and t, return true if t is an anagram of s, and false otherwise.
  */
object ValidAnagramSolver {
  def solve(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }
}
