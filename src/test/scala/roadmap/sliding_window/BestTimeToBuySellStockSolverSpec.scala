package roadmap.sliding_window

import org.scalatest.wordspec.AnyWordSpec

class BestTimeToBuySellStockSolverSpec extends AnyWordSpec {

  "BestTimeToBuySellStockSolver" when {
    "given an array prices where prices[i] is the price of a given stock on the ith day." should {
      "return maximum profit you can achieve from this transaction" in {
        assert(
          BestTimeToBuySellStockSolver.solve(Array(7, 1, 5, 3, 6, 4)) === 5
        )
      }
      "return 0 if no profit may be achieved" in {
        assert(BestTimeToBuySellStockSolver.solve(Array(7, 6, 4, 3, 1)) === 0)
      }
    }
  }
}
