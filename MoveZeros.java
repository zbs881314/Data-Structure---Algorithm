public class Solution {
  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i<nums.length; i++) {
      if(nums[i]!=0) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j++;
      }
    }
  }
}


//method 2 python

def moveZeros(self, nums):
    zero = 0
    for i in xrange(len(nums)):
        if nums[i] != 0 and zero <= i:
            nums[i], nums[zero] = nums[zero], nums[i]
            zero += 1
