/**
 * https://leetcode.com/problems/missing-number/
 * self
 */
class Solution {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int[] compare = new int[nums.length + 1];
    for (int i = 0; i <= nums.length; i++) {
      compare[i] = i;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) return i;
    }
    return compare[nums.length];
  }
}