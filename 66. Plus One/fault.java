/**
 * https://leetcode.com/problems/plus-one/
 * self
 */
class Solution {
  public int[] plusOne(int[] digits) {
    int total = 0;
    for (int i = 0; i < digits.length; i++) {
      total += digits[i] * (int)Math.pow(10, digits.length - 1 - i);
    }
    total += 1;
    System.out.println(total);
    String s = String.valueOf(total);
    int[] ans = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      ans[i] = s.charAt(i) - '0';
    }
    return ans;
  }
}