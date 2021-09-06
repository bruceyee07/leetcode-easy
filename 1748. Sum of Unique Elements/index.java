/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 * self
 */
class Solution {
  public int sumOfUnique(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      if (map.containsKey(val)) {
        map.put(val, map.get(val) + 1);
      } else {
        map.put(val, 1);
      }
    }
    int count = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        count += entry.getKey();
      }
    }
    return count;
  }
}