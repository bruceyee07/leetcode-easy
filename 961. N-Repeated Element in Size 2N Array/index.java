/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * self
 */
class Solution {
  public int repeatedNTimes(int[] nums) {
    int count = nums.length / 2;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == count) {
        return entry.getKey();
      }
    }
    return -1;
  }
}