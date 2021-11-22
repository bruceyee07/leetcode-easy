/**
 * https://leetcode.com/problems/move-zeroes/
 * self
 */
class Solution {
  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length - 1; i ++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == 0 && nums[j] != 0) {
          swap(nums, i, j);
        }
      }
    }
  }

  public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}