/**
 * https://leetcode.com/problems/implement-strstr/
 * https://leetcode.com/problems/implement-strstr/discuss/12811/Share-my-accepted-java-solution
 */
class Solution {
  public int strStr(String haystack, String needle) {
    int l1 = haystack.length(), l2 = needle.length();
    if (l1 < l2) return -1;
    if (l2 == 0) return 0;
    int thresshold = l1 - l2;
    for (int i = 0; i <= thresshold; i++) {
      if (haystack.substring(i, i + l2).equals(needle)) return i;
    }
    return -1;
  }
}