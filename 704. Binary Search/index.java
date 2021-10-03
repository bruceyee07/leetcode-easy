/**
 * https://leetcode.com/problems/binary-search/
 * self
 */
class Solution {
  public int search(int[] nums, int target) {
    int lo = 0, hi = nums.length;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo < nums.length && nums[lo] == target ? lo : -1;
  }
}