/**
 * https://leetcode.com/problems/relative-ranks/
 * self
 */
class Solution {
  public String[] findRelativeRanks(int[] score) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Gold Medal");
    map.put(2, "Silver Medal");
    map.put(3, "Bronze Medal");
    String[] res = new String[score.length];
    Queue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
    for (int i = 0; i < score.length; i++) {
      q.offer(new int[]{i, score[i]});
    }
    for (int i = 0; i < res.length; i++) {
      int[] pair = q.poll();
      res[pair[0]] = map.getOrDefault(Integer.valueOf(i + 1), String.valueOf(i + 1));
    }
    return res;
  }
}