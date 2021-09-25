/**
 * https://leetcode.com/problems/last-stone-weight/
 * https://leetcode.com/problems/last-stone-weight/discuss/294956/JavaC%2B%2BPython-Priority-Queue
 */
class Solution {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
    for (int stone : stones)
      q.offer(stone);
    while (q.size() > 1)
      q.offer(q.poll() - q.poll());
    return q.poll();
  }
}