//Recursive

public boolean isSymmetric(TreeNode root) {
  if(root==null) return true;
  return isMirror(root.left, root.right);
}
public boolean isMirror(TreeNode p, TreeNode q) {
  if(p==null && q==null) return true;
  if(p==null || q==null) return false;
  return (p.val==q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
}


// method 2 python
// Basically this question is recursively. or we can say, the tree structure is recursively, so the recusively solution maybe easy
class Solution:
  def isSymmetric(self, root):
    if root is None:
      return True
    else:
      return self.isMirror(root.left, root.right)
  def isMirror(self, left, right):
    if left is None and right is None:
      return True
    if left is None or right is None:
      return False

    if left.val == right.val:
      outPair = self.isMirror(left.left, right.right)
      inPair = self.isMirror(left.right, right.left)
      return outPair and inPair
    else:
      return False

// python the essence of recursively is Stack, so we can use our own stack to rewrite it into iteratively

class Solution2:
  def isSymmatric(self, root):
    if root is None:
      return True
    
    stack = [[root.left, root.right]]

    while len(stack) > 0:
      pair = stack.pop(0)
      left = pair[0]
      right = pair[1]

      if left is None and right is None:
        continue
      if left is None or right is None:
        return False
      if left.val == right.val:
        stack.insert(0, [left.left, right.right])
        stack.insert(0, [left.right, right.left])

      else:
        return False
    return True

    // python

    def isSymmetric(self, root):
      # stack used to hold the matching pairs
      stack = []
      # if root=None, or if root has no children, root is symmetric
      if not root or (not root.left and not root.right):
        return True
    
      stack.append((root.left, root.right))
      while len(stack):
        # the order of node retrieval matters little here, because we only care
        # about pair content and not the relative order of different pairs; queue
        # is quicker at finding shallow discrepancy, where stack is quicker at 
        # finding deeper discrepancy
        left, right = stack.pop()
        # if left and right are not symmetric, return false
        if not left or not right or (left.val != right.val):
          return False
        # only append if the corresponding pairs exist

        if left.left or right.right:
          stack.append((left.left, right.right))
        if left.right or right.left:
          stack.append((left.right, right.left))
      return True
