package leetcode.p24


object Solution {
  def swapPairs(head: ListNode): ListNode = {
    if (head == null || head.next == null) {
      head
    } else {
      val n = head.next
      head.next = swapPairs(n.next)
      n.next = head
      n
    }
  }
}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}