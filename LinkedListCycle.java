// 1.Use two pointers, walker and runner.
// 2.walker moves step by step, runner moves two steps at time
// 3.if the Linked List has a cycle, walker and runner will meet at some point
public boolean hasCycle(ListNode head) {
  if(head==null) return false;
  ListNode walker = head;
  ListNode runner = head;
  while(runner.next != null && runner.next.next != null) {
    walker = walker.next;
    runner = runner.next.next;
    if(walker==runner) return true;
  }
  return false;
}


// python
def hasCycle(self, head):
  try:
    slow = head
    fast = head.next
    while slow is not fast:
      slow = slow.next
      fast = fast.next.next
    return True
  except:
    return False


