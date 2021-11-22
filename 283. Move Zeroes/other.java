/**
 * https://leetcode.com/problems/move-zeroes/
 * https://leetcode.com/problems/move-zeroes/solution/
 */
class Solution {
  public void moveZeroes(int[] nums) {
    int lastNonZeroIndex = 0;
    for (int i = 0; i < nums.length; i ++) {
      if (nums[i] != 0) nums[lastNonZeroIndex++] = nums[i];
    }
    for (int i = lastNonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}