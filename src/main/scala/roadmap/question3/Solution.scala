package roadmap.question3

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
object Solution extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numIndices = scala.collection.mutable.HashMap[Int, Int]()
    for ((num, index) <- nums.zipWithIndex) {
      val complement = target - num
      if (numIndices.contains(complement)) return Array(numIndices(complement), index)
      else numIndices(num) = index
    }
    throw new Exception("Solution not found")
  }
}
