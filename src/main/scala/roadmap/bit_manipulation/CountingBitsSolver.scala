package roadmap.bit_manipulation

object CountingBitsSolver {
  def solve(n: Int): Array[Int] =
    (for (i <- 0 until n + 1) yield Integer.bitCount(i)).toArray
}
