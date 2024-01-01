package roadmap.arrays_and_hashing

/** https://leetcode.com/problems/two-sum/
  */

object TwoSumSolver {
  def solve(nums: Array[Int], target: Int): Array[Int] = {
    val numIndices = scala.collection.mutable.HashMap[Int, Int]()
    for ((num, index) <- nums.zipWithIndex) {
      val complement = target - num
      if (numIndices.contains(complement))
        return Array(numIndices(complement), index)
      else numIndices(num) = index
    }
    throw new Exception("Solution not found")
  }
}
