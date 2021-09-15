/**
 * https://leetcode.com/problems/contains-duplicate/
 * self
 */
class Solution {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    for (int val : map.values()) {
      if (val > 1) {
        return true;
      }
    }
    return false;
  }
}