/**
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/discuss/888949/JavaC%2B%2BPython-Parentheses-Problem-Foundation
 * Count the depth, plus 1 and minus 1 for ( and ) respectively; The max value of depth is the solution.
 */
class Solution {
  public int maxDepth(String s) {
    int res = 0, depth = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(')
        res = Math.max(res, ++depth);
      else if (s.charAt(i) == ')')
        depth--;
    }
    return res;
  }
}