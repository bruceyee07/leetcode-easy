/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)
 */
class Solution {
  public int maxProfit(int[] prices) {
    int maxCur = 0, maxSoFar = 0;
    for (int i = 1; i <  prices.length; i++) {
      maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
      maxSoFar = Math.max(maxCur, maxSoFar);
    }
    return maxSoFar;
  }
}