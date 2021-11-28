/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
class Solution {
  public int countNegatives(int[][] grid) {
    int cnt = 0;
    int m = grid.length, n = grid[0].length;
    int r = m - 1, c = 0;
    while (r >= 0 && c < n) {
      if (grid[r][c] < 0) {
        cnt += n - c;
        r--;
      } else {
        c++;
      }
    }
    return cnt;
  }
}