/**
 * https://leetcode.com/problems/is-subsequence/
 * self
 */
class Solution {
  public boolean isSubsequence(String s, String t) {
    StringBuilder sb = new StringBuilder();
    for (char c : t.toCharArray()) {
      if (s.contains(String.valueOf(c))) {
        sb.append(c);
      }
    }
    System.out.println(sb.toString());
    return sb.toString().contains(s);
  }
}