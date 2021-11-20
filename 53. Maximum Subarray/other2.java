/**
 * https://leetcode.com/problems/maximum-subarray/
 * https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
 */
class Solution {
  public int maxSubArray(int[] nums) {
    int maxEndingHere = nums[0], maxSoFar = nums[0];
    for (int i = 1; i < nums.length; i++) {
      maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);
      maxSoFar = Math.max(maxEndingHere, maxSoFar);
    }
    return maxSoFar;
  }
}