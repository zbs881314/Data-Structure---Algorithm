class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
      if(digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] newNumber = new int[n+1];
    newNumber[0] = 1;
    return newNumber;
  }
}


// method 2 python
// we are given a list of digits, and the idea here is to convert that list to an 
// integer, num. So each digit is multiplited by the proper place value and added to 
// num. For example, if digits=[3, 8, 2, 5] then on the first iteration 3 is 
// multiplied by 10 to the power of 4-1-0=3, so this results in 3000, which is added 
// to num. Then 8 is multiplied by 10^2 and added to num, and so on. The last step
// is to add 1 to num, convert it to a list and return that list.

def plusOne(digits):
  num = 0
  for i in range(len(digits)):
    num += digits[i] * pow(10, (len(digits)-1-i))
  return [int(i) for i in str(num+1)]



def plusOne2(self, digits):
  for i in range(len(digits)-1, -1, -1):
    if digits[i] < 9:
      digits[i] = digits[i] + 1
      return digits
    else:
      digits[i] = 0
  digits.insert(0, 1)
  return digits
