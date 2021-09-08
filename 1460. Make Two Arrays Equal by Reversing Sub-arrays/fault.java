/**
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * self
 */
class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    int n = target[0] ^ arr[0];
    for (int i = 1; i < target.length; i++) {
      n ^= target[i];
      n ^= arr[i];
    }
    return n == 0;
  }
}