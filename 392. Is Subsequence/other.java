/**
 * https://leetcode.com/problems/is-subsequence/
 * https://leetcode.com/problems/is-subsequence/discuss/87302/Binary-search-solution-for-follow-up-with-detailed-comments @JagdishHiremath
 */
class Solution {
  public boolean isSubsequence(String s, String t) {
    int index = -1;
    for (char c : s.toCharArray()) {
      index = t.indexOf(c, index + 1);
      if (index == -1) return false;
    }
    return true;
  }
}