class Solution {
  public int romanToInt(String s) {
    int nums[] = new int[s.length()];
    for(int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case 'M':
          nums[i] = 1000;
          break;
        case 'D':
          nums[i] = 500;
          break;
        case 'C':
          nums[i] = 100;
          break;
        case 'L':
          nums[i] = 50;
          break;
        case 'X':
          nums[i] = 10;
          break;
        case 'V':
          nums[i] = 5;
          break;
        case 'I':
          nums[i] = 1;
          break;

      }
    }
    int sum = 0;
    for(int i=0; i<nums.length-1; i++) {
      if(nums[i]<nums[i+1])
        sum -= nums[i];
      else
        sum += nums[i];
    }
    return sum+nums[nums.length-1];
  }
}

# method 2 python

class Solution:
# @param {string} s
# @return {integer}
def romanToInt(self, s):
  roman = {'M': 1000, 'D': 500, 'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1}
  z = 0
  for i in range(0, len(s) - 1):
    if roman[s[i]] < roman[s[i+1]]:
        z -= roman[s[i]]
    else:
        z += roman[s[i]]
  return z + roman[s[-1]]
