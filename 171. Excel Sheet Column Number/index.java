/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 * self
 */
class Solution {
  public int titleToNumber(String columnTitle) {
    int ans = 0;
    for (int i = 0; i < columnTitle.length(); i++) {
      ans += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - 1 - i);
    }
    return ans;
  }
}