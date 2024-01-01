package roadmap.arrays_and_hashing

/** https://leetcode.com/problems/valid-anagram/submissions/
  */

object ValidAnagramSolver {
  def solve(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }
}
