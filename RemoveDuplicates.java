class Solution {
  public:
  int removeDuplicates(int A[], int n) {
    if(n<2) return n;
    int id = 1;
    for(int i=1; i<n; ++i)
      if(A[i] != A[i-1]) A[id++] = A[i];
    return id;
  }
}


public int removeDuplicates(int[] nums) {
  if(nums == null || nums.length == 0) return 0;
  int len = 1;
  for(int i=1; i<nums.length; i++){
    if(nums[i] != nums[i-1]) {
      nums[len] = nums[i];
      len++;
    }
  }
  return len;
}


// javascrip

var removeDuplicates = function(nums) {
  if(!nums || !nums.length) {
    return 0;
  }
  let length = 1;
  for(let i=1; i<nums.length; i++) {
    if(nums[i] !== nums[i-1]) {
      nums[length++] = nums[i];
    }
  }
  return length;
}


// python

class Solution:
  def removeDuplicates(self, A):
    if not A:
      return 0
    newTail = 0
    for i in range(1, len(A)):
      if A[i] != A[newTail]:
        newTail += 1
        A[newTail] = A[i]
    return newTail + 1
