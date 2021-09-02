/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * self
 */
class Solution {
  public int numIdenticalPairs(int[] nums) {
    HashMap<Integer, Integer> hs = new HashMap<>();
    int count = 0;
    for (int val : nums) {
      if (hs.containsKey(val)) {
        int existCount = hs.get(val);
        count += existCount;
        hs.put(val, existCount + 1);
      } else {
        hs.put(val, 1);
      }
    }
    return count;
  }
}