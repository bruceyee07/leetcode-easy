/**
 * https://leetcode.com/problems/two-sum/
 * https://leetcode.com/problems/two-sum/discuss/3/Accepted-Java-O(n)-Solution
 */
class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])) {
        result[1] = i;
        result[0] = map.get(target - numbers[i]);
        return result;
      }
      map.put(numbers[i], i);
    }
    return result;
  }
}