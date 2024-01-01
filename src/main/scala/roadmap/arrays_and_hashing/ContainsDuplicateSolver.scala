package roadmap.arrays_and_hashing

/** https://leetcode.com/problems/contains-duplicate/
  */

object ContainsDuplicateSolver {
  def solve(nums: Array[Int]): Boolean = {
    nums.toSet.size < nums.length
  }
}
