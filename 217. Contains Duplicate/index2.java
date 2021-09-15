/**
 * https://leetcode.com/problems/contains-duplicate/
 * self
 */
class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int val : nums) {
      set.add(val);
    }
    return set.size() != nums.length;
  }
}