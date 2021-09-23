/**
 * https://leetcode.com/problems/backspace-string-compare/
 * https://leetcode.com/problems/backspace-string-compare/solution/
 */
class Solution {
  public boolean backspaceCompare(String s, String t) {
    return build(s).equals(build(t));
  }

  public String build(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c != '#')
        stack.push(c);
      else if (!stack.empty())
        stack.pop();
    }
    return String.valueOf(stack);
  }
}