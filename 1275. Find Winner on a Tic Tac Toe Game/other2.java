/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/441319/JavaPython-3-Check-rows-columns-and-two-diagonals-w-brief-explanation-and-analysis. @ezpzm9
 */
class Solution {
  // General solution for a nxn board, beats 100%:
  public String tictactoe(int[][] moves) {
    int n = 3;
    int[] rows = new int[n];
    int[] cols = new int[n];
    int diag1 = 0;
    int diag2 = 0;
    int currPlayer = 1;   // 1 is 'A', -1 is 'B'

    for (int[] currMove : moves) {
      rows[currMove[0]] += currPlayer;
      cols[currMove[1]] += currPlayer;
      diag1 = currMove[0] == currMove[1] ? diag1 + currPlayer : diag1;
      diag2 = currMove[0] + currMove[1] == n - 1 ? diag2 + currPlayer : diag2; 
      
      if (Math.abs(rows[currMove[0]]) == n || Math.abs(cols[currMove[1]]) == n || Math.abs(diag1) == n || Math.abs(diag2) == n) {
        return currPlayer == 1 ? "A" : "B";
      }
      currPlayer *= -1;
    }
    
    return moves.length < n * n ? "Pending" : "Draw";
  }
}
