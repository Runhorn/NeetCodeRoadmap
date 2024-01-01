package roadmap.arrays_and_hashing

/** https://leetcode.com/problems/contains-duplicate/ Given an integer array
  * nums, return true if any value appears at least twice in the array, and
  * return false if every element is distinct.
  */
object ContainsDuplicateSolver {
  def solve(nums: Array[Int]): Boolean = {
    nums.toSet.size < nums.length
  }
}
