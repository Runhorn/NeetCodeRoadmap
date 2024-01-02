package roadmap.linked_list

import org.scalatest.wordspec.AnyWordSpec

class ReverseLinkedListSolverSpec extends AnyWordSpec {
  val nullNode: ListNode = null
  def areIdentical(lista: ListNode, listb: ListNode): Boolean = {
    var a = lista
    var b = listb
    while (a.next != nullNode && b.next != nullNode) {
      if (lista.x != listb.x) return false
      a = a.next
      b = b.next
    }
    nullNode == a.next && nullNode == b.next
  }

  "ReverseLinkedListSolver" when {
    "Given the head of a singly linked list" should {
      "reverse long list and return it" in {
        val iln1 = new ListNode(1)
        val iln2 = new ListNode(2, iln1)
        val iln3 = new ListNode(3, iln2)
        val iln4 = new ListNode(4, iln3)
        val iln5 = new ListNode(5, iln4)

        val oln1 = new ListNode(5)
        val oln2 = new ListNode(4, oln1)
        val oln3 = new ListNode(3, oln2)
        val oln4 = new ListNode(2, oln3)
        val oln5 = new ListNode(1, oln4)

        assert(areIdentical(ReverseLinkedListSolver.solve(iln5), oln5) === true)
      }
      "reverse short list and return it" in {
        val iln1 = new ListNode(1)
        val iln2 = new ListNode(2, iln1)

        val oln1 = new ListNode(2)
        val oln2 = new ListNode(1, oln1)

        assert(areIdentical(ReverseLinkedListSolver.solve(iln2), oln2) === true)
      }
      "handle empty list " in {
        val iln1 = new ListNode()
        val oln1 = new ListNode()
        assert(areIdentical(ReverseLinkedListSolver.solve(iln1), oln1) === true)
      }
    }
  }
}
