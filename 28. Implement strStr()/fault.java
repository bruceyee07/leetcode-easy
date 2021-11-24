/**
 * https://leetcode.com/problems/implement-strstr/
 * self
 * TLE
 */
class Solution {
  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) return 0;
    for (int i = 0; i<= haystack.length() - needle.length(); i++) {
      for (int j = i + needle.length() - 1; j < haystack.length(); j++) {
        if (haystack.substring(i, j + 1).equals(needle)) {
          return i;
        }
      }
    }
    return -1;
  }
}