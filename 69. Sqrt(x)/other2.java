/**
 * https://leetcode.com/problems/sqrtx/
 * https://leetcode.com/problems/sqrtx/discuss/25047/A-Binary-Search-Solution @HigherBrothers
 */
class Solution {
  public int mySqrt(int x) {
    int left = 1, right = x;
    int ans = 0;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (mid <= x / mid) {
        left = mid + 1;
        ans = mid;
      } else {
        right = mid - 1;
      }
    }
    return ans;
  }
}