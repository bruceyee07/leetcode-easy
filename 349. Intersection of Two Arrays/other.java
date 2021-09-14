/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * https://leetcode.com/problems/intersection-of-two-arrays/solution/
 */
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    for (int val : nums1) set1.add(val);
    HashSet<Integer> set2 = new HashSet<>();
    for (int val : nums2) set2.add(val);

    set1.retainAll(set2);
    int[] res = new int[set1.size()];
    int idx = 0;
    for (int val : set1) {
      res[idx++] = val;
    }
    return res;
  }
}