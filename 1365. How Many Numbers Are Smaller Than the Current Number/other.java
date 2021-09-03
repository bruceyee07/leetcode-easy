/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/discuss/535421/Java-Clean-HashMap-solution-with-explanation
 */
class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    HashMap<Integer, Integer> hs = new HashMap<>();
    int[] copy = nums.clone();
    Arrays.sort(copy);
    for (int i = 0; i < nums.length; i++) {
      hs.putIfAbsent(copy[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      copy[i] = hs.get(nums[i]);
    }
    return copy;
  }
}