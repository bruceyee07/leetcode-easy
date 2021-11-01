/**
 * https://leetcode.com/problems/plus-one/
 * https://leetcode.com/problems/plus-one/discuss/24082/My-Simple-Java-Solution
 */
class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] ans = new int[n + 1];
    ans[0] = 1;
    return ans;
  }
}