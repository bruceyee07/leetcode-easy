/**
 * https://leetcode.com/problems/backspace-string-compare/
 * self
 */
class Solution {
  public boolean backspaceCompare(String s, String t) {
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '#' && s1.length() > 0)
        s1.deleteCharAt(s1.length() - 1);
      else if (c != '#')
        s1.append(c);
    }

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      if (c == '#' && s2.length() > 0)
        s2.deleteCharAt(s2.length() - 1);
      else if (c != '#')
        s2.append(c);
    }

    return s1.toString().equals(s2.toString());
  }
}