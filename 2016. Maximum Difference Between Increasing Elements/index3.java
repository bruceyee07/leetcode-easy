/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 * self
 */
class Solution {
  public int maximumDifference(int[] nums) {
    int minValue = Integer.MAX_VALUE, maxDiff = 0;
    for (int val : nums) {
      if (val < minValue) {
        minValue = val;
      } else if (val - minValue > maxDiff) {
        maxDiff = val - minValue;
      }
    }
    return maxDiff == 0 ? -1 : maxDiff;
  }
}
