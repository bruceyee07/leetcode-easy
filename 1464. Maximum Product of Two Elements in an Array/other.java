/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/discuss/661687/JavaPython-3-Find-the-max-2-numbers.
 */
class Solution {
  public int maxProduct(int[] nums) {
    int max1 = 0, max2 = 0;
    for (int val : nums) {
      if (val >= max1) {
        max2 = max1;
        max1 = val;
      } else if (val > max2) {
        max2 = val;
      }
    }
    return (max1 - 1) * (max2 - 1);
  }
}