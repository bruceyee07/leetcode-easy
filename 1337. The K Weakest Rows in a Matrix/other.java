/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/discuss/496555/Java-Best-Solution-100-TimeSpace-Binary-Search-%2B-Heap
 */
class Solution {
  public int[] kWeakestRows(int[][] mat, int k) {
    Queue<int[]> q = new PriorityQueue<>((a, b) -> {
      if (a[0] == b[0]) return b[1] - a[1];
      return b[0] - a[0];
    });

    for (int i = 0; i < mat.length; i++) {
      q.offer(new int[]{numberOfOnes(mat[i]), i});
      if (q.size() > k) {
        q.poll();
      }
    }

    int[] ans = new int[k];
    while (k > 0) {
      ans[--k] = q.poll()[1];
    }
    return ans;
  }
  
  public int numberOfOnes(int[] row) {
    int low = 0, high = row.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (row[mid] == 1) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}