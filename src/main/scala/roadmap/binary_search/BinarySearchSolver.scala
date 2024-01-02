package roadmap.binary_search

/** https://leetcode.com/problems/binary-search/description/ */

object BinarySearchSolver {
  def solve(nums: Array[Int], target: Int): Int = {
    import scala.annotation.tailrec
    @tailrec def binarySearch(left: Int, right: Int): Int = {
      if (left > right) -1
      else {
        val mid = (left + right) / 2
        if (nums(mid) == target) mid
        else if (nums(mid) < target) binarySearch(mid + 1, right)
        else binarySearch(left, mid - 1)
      }
    }

    binarySearch(0, nums.length - 1)
  }
}
