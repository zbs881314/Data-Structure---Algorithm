class Solution {
  public int singleNumber(int[] nums) {
    int ans = 0;
    int len = nums.length;
    for(int i=0; i!=len; i++) {
      ans ^= nums[i;]
    }
    return ans
  }
}

// method 2 python

def singleNumber1(self, nums):
    res = 0
    for num in nums:
        res ^= num
    return res


def singleNumber2(self, nums):
    return reduce(lambda x, y: x^y, nums)
