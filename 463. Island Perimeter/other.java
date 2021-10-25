/**
 * https://leetcode.com/problems/island-perimeter/
 * https://leetcode.com/problems/island-perimeter/discuss/94992/Java-9-line-solution-add-4-for-each-land-and-remove-2-for-each-internal-edge
 */
class Solution {
  public int islandPerimeter(int[][] grid) {
    int row = grid.length, col = grid[0].length;
    if (row == 0 || col == 0) return 0;
    int cnt = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == 1) {
          cnt += 4;
          if (i > 0 && grid[i - 1][j] == 1)
            cnt -= 2;
          if (j > 0 && grid[i][j - 1] == 1)
            cnt -= 2;
        }
      }
    }
    return cnt;
  }
}