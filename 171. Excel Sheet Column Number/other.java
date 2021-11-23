/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 * https://leetcode.com/problems/excel-sheet-column-number/discuss/52154/Concise-java-solution-with-explanation.
 */
class Solution {
  public int titleToNumber(String columnTitle) {
    int ans = 0;
    for (char c : columnTitle.toCharArray()) {
      ans *= 26;
      ans += c - 'A' + 1;
    }
    return ans;
  }
}