/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * self
 */
class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map1 = new HashMap<>();
    for (int val : nums1) map1.put(val, map1.getOrDefault(val, 0) + 1); 
    Map<Integer, Integer> map2 = new HashMap<>();
    for (int val : nums2) map2.put(val, map2.getOrDefault(val, 0) + 1);
    List<Integer> list = new ArrayList<>();
    for (int val : map1.keySet()) {
      if (map2.containsKey(val)) {
        int count = Math.min(map1.get(val), map2.get(val));
        for (int i = 0; i < count; i++) {
          list.add(val);
        }
      }
    }
    return list.stream().mapToInt(x -> x).toArray();
  }
}