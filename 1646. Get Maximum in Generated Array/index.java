/**
 * https://leetcode.com/problems/get-maximum-in-generated-array/
 * self
 */
class Solution {
  public int getMaximumGenerated(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    for (int j = 2; j <= n; j++) {
      if (j % 2 == 0) {
        dp[j] = dp[j / 2]; 
      } else {
        dp[j] = dp[(j - 1) / 2] + dp[(j - 1) / 2 + 1];
      }
    }
    return Arrays.stream(dp).max().getAsInt();
  }
}