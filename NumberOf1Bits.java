// n in bit AND with 1 and if this operation result is 1, that mean that the last 
// bit of the input integer is 1. Thus we add it to the 1st count. Then we shift the // input integer by one on the right, to check for the next bit.
public static int hammingWeight(int n) {
  int ones = 0;
    while(n!=0) {
      ones = ones + (n & 1);
      n = n>>>1;
    }
    return ones;
}


// method 2 python
def hammingWeight(self, n):
  return bin(n).count('1')


// Using bit operation to cancel a 1 in each round
// Think of a number in binary n=1000, n-1 is 0111, n & (n-1) will be 0000 which is // just cancel the last 1

def hammingWeight(self, n):
  c = 0
  while n:
    n &= n-1
    c += 1
  return c
