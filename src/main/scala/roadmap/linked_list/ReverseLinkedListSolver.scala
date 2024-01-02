package roadmap.linked_list
import scala.annotation.tailrec

/** https://leetcode.com/problems/reverse-linked-list/description/ */

object ReverseLinkedListSolver {
  def solve(head: ListNode): ListNode = {
    @tailrec def reverse(head: ListNode, result: ListNode = null): ListNode =
      head match {
        case null => result
        case h =>
          val current = h.next
          h.next = result
          reverse(current, h)
      }
    reverse(head)
  }
}
