/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 * self
 */
class Solution {
  public int maximumDifference(int[] nums) {
    int minValue = Integer.MAX_VALUE, maxDiff = -1;
    for (int val : nums) {
      if (val < minValue) {
        minValue = val;
      } else if (val - minValue > Math.max(0, maxDiff)) {
        maxDiff = val - minValue;
      }
    }
    return maxDiff;
  }
}
