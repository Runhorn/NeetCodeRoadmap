package roadmap.sliding_window

/** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */

object BestTimeToBuySellStockSolver {
  def solve(prices: Array[Int]): Int = {
    var buy = prices(0)
    var profit = 0

    for (i <- prices.indices) {
      if (buy > prices(i)) buy = prices(i)
      else if (prices(i) - buy > profit) profit = prices(i) - buy
    }
    profit
  }
}
