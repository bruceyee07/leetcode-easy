/**
 * https://leetcode.com/problems/majority-element/
 * self
 */
class Solution {
  public int majorityElement(int[] nums) {
    double gate = Math.floor(nums.length / 2);
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > gate) {
        return entry.getKey();
      }
    }
    return -1;
  }
}
