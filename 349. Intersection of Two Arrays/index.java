/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * self
 */
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int val : nums1) {
      set.add(val);
    }
    List<Integer> list = new ArrayList<>();
    for (int val : nums2) {
      if (set.contains(val) && !list.contains(val)) {
        list.add(val);
      }
    }
    return list.stream().mapToInt(x -> x).toArray();
  }
}