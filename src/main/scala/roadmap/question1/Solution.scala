package roadmap.question1

/**
 * https://leetcode.com/problems/contains-duplicate/
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
object Solution extends App {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.toSet.size < nums.length
  }

  val numbers = Array(1,1,1,3,3,4,3,2,4,2)
  println(containsDuplicate(numbers))
}