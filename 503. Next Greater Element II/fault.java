/**
 * https://leetcode.com/problems/next-greater-element-ii/
 * self
 */
class Solution {
  public int[] nextGreaterElements(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    int[] target = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
    int[] res = new int[nums.length];
    for (int val : target) {
      while (!stack.isEmpty() && stack.peek() < val) {
        map.putIfAbsent(stack.pop(), val);
      }
      stack.push(val);
    }
    for (int i = 0; i < nums.length; i++) {
      res[i] = map.getOrDefault(nums[i], -1);
    }
    return res;
  }
}