/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 * self
 */
class Solution {
  public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
      if (a.getValue() == b.getValue()) return b.getKey() - a.getKey();
      return a.getValue() - b.getValue();
    });
    pq.addAll(map.entrySet());
    List<Integer> list = new ArrayList<>();
    while (!pq.isEmpty()) {
      Map.Entry entry = pq.poll();
      for (int i = 0; i < (int)entry.getValue(); i++) {
        list.add((int)entry.getKey());
      }
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }
}