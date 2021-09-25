/**
 * https://leetcode.com/problems/relative-ranks/
 * self
 */
class Solution {
  public String[] findRelativeRanks(int[] score) {
    String[] res = new String[score.length];
    Queue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
    for (int i = 0; i < score.length; i++) {
      q.offer(new int[]{i, score[i]});
    }
    for (int i = 0; i < res.length; i++) {
      int[] pair = q.poll();
      res[pair[0]] = 
        i == 0 ? "Gold Medal" :
        i == 1 ? "Silver Medal" :
        i == 2 ? "Bronze Medal" :
        String.valueOf(i + 1);
    }
    return res;
  }
}