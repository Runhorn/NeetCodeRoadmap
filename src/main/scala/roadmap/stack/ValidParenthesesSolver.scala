package roadmap.stack

/** https://leetcode.com/problems/valid-parentheses/
  */

object ValidParenthesesSolver {
  def solve(s: String): Boolean = {
    import scala.collection.mutable._
    val st = new Stack[Char](s.length)
    val pairs = Map(')' -> '(', '}' -> '{', ']' -> '[')
    s.foreach {
      case c if pairs.contains(c) => {
        if (st.isEmpty || pairs(c) != st.pop()) return false
      }
      case c => st.push(c)
    }
    st.isEmpty
  }
}
