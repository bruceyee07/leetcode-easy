/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/441319/JavaPython-3-Check-rows-columns-and-two-diagonals-w-brief-explanation-and-analysis.
 */
class Solution {
  public String tictactoe(int[][] moves) {
    int[] aRow = new int[3], aCol = new int[3], bRow = new int[3], bCol = new int[3];
    int aMainDiag = 0, aSkewDiag = 0, bMainDiag = 0, bSkewDiag = 0;
    for (int i = 0; i < moves.length; i++) {
      int r = moves[i][0], c = moves[i][1];
      if (i % 2 == 0) {
        if (++aRow[r] == 3 || ++aCol[c] == 3 || r == c && ++aMainDiag == 3 || r + c == 2 && ++aSkewDiag == 3) return "A";
      } else {
        if (++bRow[r] == 3 || ++bCol[c] == 3 || r == c && ++bMainDiag == 3 || r + c == 2 && ++bSkewDiag == 3) return "B";
      }
    }
    return moves.length == 9 ? "Draw" : "Pending"; 
  }
}

/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/441319/JavaPython-3-Check-rows-columns-and-two-diagonals-w-brief-explanation-and-analysis. @ezpzm9
 * General solution for a nxn board, beats 100%:
 */
class Solution {
  public String tictactoe(int[][] moves) {
    int n = 3;
    int[] rows = new int[3], cols = new int[3];
    int diag1 = 0, diag2 = 0;
    int currentPlayer = 1; // 1: A, -1: B
    for (int[] move : moves) {
      int r = move[0], c = move[1];
      rows[r] += currentPlayer;
      cols[c] += currentPlayer;
      diag1 = r == c ? diag1 + currentPlayer : diag1;
      diag2 = r + c == n - 1 ? diag2 + currentPlayer : diag2;
      if (Math.abs(rows[r]) == n || Math.abs(cols[c]) == n || Math.abs(diag1) == n || Math.abs(diag2) == n) {
        return currentPlayer == 1 ? "A" : "B";
      }
      currentPlayer = -currentPlayer;
    }
    return moves.length == n * n ? "Draw" : "Pending";
  }
}