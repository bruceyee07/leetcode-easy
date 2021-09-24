/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * self
 */
class Solution {
  public class Pair {
    Integer row;
    Integer soldiers;
    public Pair(Integer row, Integer soldiers) {
      this.row = row;
      this.soldiers = soldiers;
    }
  }
  public int[] kWeakestRows(int[][] mat, int k) {
    Queue<Pair> queue = new PriorityQueue<>((a, b) -> {
      if (a.soldiers == b.soldiers) return a.row - b.row;
      return a.soldiers - b.soldiers;
    });
    List<Pair> list = new ArrayList<>();
    for (int i = 0; i < mat.length; i++) {
      int soldiers = Arrays.stream(mat[i]).filter(x -> x == 1).sum();
      list.add(new Pair(i, soldiers));
    }
    int[] res = new int[k];
    for (Pair pair : list) {
      queue.offer(pair);
    }
    for (int i = 0; i < k; i++) {
      Pair pair = queue.poll();
      res[i] = pair.row;
    }
    return res;
  }
}