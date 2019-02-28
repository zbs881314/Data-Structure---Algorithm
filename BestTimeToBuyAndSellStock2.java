public class Solution {
  public int maxProfit(int[] prices) {
    int total = 0;
    for (int i = 0; i<prices.length-1; i++) {
      if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
    }
    return total;
  }
}



// method 2 python

class Solution(object):
  def maxProfit(self, prices):
    return sum(max(prices[i+1] - prices[i], 0) for i in range(len(prices) - 1))
