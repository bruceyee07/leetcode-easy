/**
 * https://leetcode.com/problems/valid-palindrome/
 * self
 */
class Solution {
  public boolean isPalindrome(String s) {
    String ss = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    return helper(ss, 0, ss.length() - 1);
  }

  public boolean helper(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) return false;
    }
    return true;
  }
}