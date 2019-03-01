//XOR a^b^b = a
public int missingNumber(int[] nums) {
  int xor = 0, i = 0;
  for (i = 0; i < nums.length; i++) {
    xor = xor^i^nums[i];
  }
  return xor^i;
}


// Sum of 0...n minus sum of the given number is the missing one
// python

def missingNumber(self, nums):
  n = len(nums)
  return n * (n+1) / 2 - sum(nums)


//java
public int missingNumber(int[] nums) {
  long n =nums.length;
  return (int) (n * (n+1)/2 - IntStream.of(nums).sum());
}
