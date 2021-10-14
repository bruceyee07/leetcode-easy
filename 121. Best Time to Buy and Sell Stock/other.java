/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
 */
class Solution {
  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxP = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else if (prices[i] - minPrice > maxP) {
        maxP = prices[i] - minPrice;
      }
    }
    return maxP;
  }
}