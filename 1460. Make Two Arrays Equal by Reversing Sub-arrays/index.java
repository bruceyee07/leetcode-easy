/**
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * self
 */
class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    Arrays.sort(target);
    Arrays.sort(arr);
    for (int i = 0; i < target.length; i++) {
      if (target[i] != arr[i]) {
        return false;
      }
    }
    return true;
  }
}