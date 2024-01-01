package roadmap.stack

import org.scalatest.wordspec.AnyWordSpec

class ValidParenthesesSolverSpec extends AnyWordSpec {

  "ValidParenthesesSolver" when {
    "presented with a string" should {
      "find valid string" in {
        assert(ValidParenthesesSolver.solve("()") === true)
        assert(ValidParenthesesSolver.solve("()[]{}") === true)
      }
      "find invalid string" in {
        assert(ValidParenthesesSolver.solve("(]") === false)
      }
    }
  }
}
