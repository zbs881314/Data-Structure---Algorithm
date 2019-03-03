class Solution {
  public boolean isHappy(int n) {
    int x = n;
    int y = n;
    while(x>1) {
      x = cal(x)
      if(x==1) return true;
      y = cal(cal(y));
      if(y==1) return true;
      if(x==y) return false;
    }
    return true;
  }
  public int cal(int n) {
    int x = n;
    int s = 0;
    while(x>0) {
      s = s+(x%10)*(x%10);
      x = x/10;
    }
    return s; 
  }
}

// java

public boolean isHappy(int n) {
  Set<Integer> inLoop = new HashSet<Integer>();
  int squareSum, remain;
  while (inLoop.add(n)) {
    squareSum = 0;
    while (n>0) {
      remain = n%10;
      squareSum += remain*remain;
      n /= 10;
    }
    if (squareSum == 1)
      return true;
    else
      n = squareSum;
  }
  return false;
}

// method 2 python

class Solution(object):
  def isHappy(self, n):
    mem = set()
    while n != 1:
      n = sum([int(i) ** 2 for i in str(n)])
      if n in mem:
        return False
      else:
        mem.add(n)
    else:
      return True
