package roadmap.bit_manipulation

object SingleNumberSolver {
  def solve(nums: Array[Int]): Int = nums.foldLeft(0) { _ ^ _ }
}
