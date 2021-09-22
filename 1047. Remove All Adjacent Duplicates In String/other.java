/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/discuss/294893/JavaC%2B%2BPython-Two-Pointers-and-Stack-Solution
 */
class Solution {
  public String removeDuplicates(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      int size = sb.length();
      if (size > 0 && sb.charAt(size - 1) == c) {
        sb.deleteCharAt(size - 1);
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}