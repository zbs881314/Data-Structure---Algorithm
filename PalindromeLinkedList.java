// In the beginning set two pointers fast and slow starting at the head
// Move, fast pointer goes to the head and slow goes to the middle
// Reverse, the right half is reversed and slow pointer becomes the 2nd head
// Compare, run the two pointers head and slow together and compare

public boolean isPalindrom(ListNode head) {
  ListNode fast = head, slow = head;
  while(fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;
  }

  if(fast != null) {
    // odd nodes: let right half smaller
    slow = slow.next;
  }
  slow = reverse(slow);
  fast = head;

  while(slow != null) {
    if(fast.val != slow.val) {
      return false;
    }
    fast = fast.next;
    slow = slow.next;
  }
  return true;
}

public ListNode reverse(ListNode head) {
  ListNode prev = null;
  while(head != null) {
    ListNode next = head.next;
    head.next = prev;
    prev = head;
    head = next;
  }
  return prev;
}


// python

def isPalindrome(self, head):
  rev = None
  slow = fast = head
  while fast and fast.next:
    fast = fast.next.next
    rev, rev.next, slow = slow, rev, slow.next
  if fast:
    slow = slow.next
  while rev and rev.val == slow.val:
    slow = slow.next
    rev = rev.next
  return not rev
