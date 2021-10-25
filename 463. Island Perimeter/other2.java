/**
 * https://leetcode.com/problems/island-perimeter/
 * https://leetcode.com/problems/island-perimeter/discuss/95001/clear-and-easy-java-solution
 */
class Solution {
  public int islandPerimeter(int[][] grid) {
    int row = grid.length, col = grid[0].length;
    if (row == 0 || col == 0) return 0;
    int islands = 0, neighbours = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == 1) {
          islands++;
          if (i + 1 < row && grid[i + 1][j] == 1) {
            neighbours++;
          }
          if (j + 1 < col && grid[i][j + 1] == 1) {
            neighbours++;
          }
        }
      }
    }
    return islands * 4 - neighbours * 2;
  }
}