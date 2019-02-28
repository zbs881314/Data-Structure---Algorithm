public void deleteNode(ListNode node) {
  node.val = node.next.val;
  node.next = node.next.next;
}

//method 2 python

def deleteNode(self, node):
  node.val = node.next.val
  node.next = node.next.next

// method 3 javaScript

var deleteNode = function(node) {
  node.val = node.next.val;
  node.next = node.next.next;
}
