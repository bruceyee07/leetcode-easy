/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 * self
 */
class Solution {
  public int maximumDifference(int[] nums) {
    int maxCur = 0, maxSoFar = 0;
    for (int i = 1; i < nums.length; i++) {
      maxCur = Math.max(0, maxCur += nums[i] - nums[i - 1]);
      maxSoFar = Math.max(maxSoFar, maxCur);
    }
    return maxSoFar == 0 ? -1 : maxSoFar;
  }
}
