/**
 * https://leetcode.com/problems/next-greater-element-i/
 * https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
 */
class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    for (int x : nums2) {
      while (!stack.isEmpty() && stack.peek() < x) {
        map.put(stack.pop(), x);
      }
      stack.push(x);
    }
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      res[i] = map.getOrDefault(nums1[i], -1);
    }
    return res;
  }
}