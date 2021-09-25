/**
 * https://leetcode.com/problems/last-stone-weight/
 * self
 */
class Solution {
  public int lastStoneWeight(int[] stones) {
    Queue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
    for (int stone : stones) {
      q.offer(stone);
    }
    while (q.size() > 1) {
      int max1 = q.poll();
      int max2 = q.poll();
      if (max1 != max2) {
        q.offer(Math.abs(max1 - max2));
      }
    }
    return q.size() == 1 ? (int)q.poll() : 0;
  }
}