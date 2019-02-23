// Iterative solution
public ListNode reverseList(ListNode head) {
  ListNode newHead = null;
  while (head != null) {
    ListNode next = head.next;
    head.next = newHead;
    newHead = head;
    head = next;
  }
  return newHead;
}

//method 2 python

def reverseList(self, head):
    prev = None
    while head:
        curr = head
        head = head.next
        curr.next = prev
        prev = curr
    return prev



def reverseList(self, head):
    return self._reverse(head)

def _reverse(self, node, prev=None):
    if not node:
        return prev
    n = node.next
    node.next = prev
    return self._reverse(n, node)
