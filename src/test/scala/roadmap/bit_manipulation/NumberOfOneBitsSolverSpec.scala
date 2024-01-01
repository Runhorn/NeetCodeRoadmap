package roadmap.bit_manipulation

import org.scalatest.wordspec.AnyWordSpec

class NumberOfOneBitsSolverSpec extends AnyWordSpec {

  "NumberOfOneBitsSolver" when {
    "presented with binary representation of an unsigned integer" should {
      "return Hamming weight" in {
        val case1 = Integer.parseInt("00000000000000000000000000001011", 2)
        val case2 = Integer.parseInt("00000000000000000000000010000000", 2)
        val case3 = -3
        assert(NumberOfOneBitsSolver.solve(case1) === 3)
        assert(NumberOfOneBitsSolver.solve(case2) === 1)
        assert(NumberOfOneBitsSolver.solve(case3) === 31)
      }
    }
  }
}
