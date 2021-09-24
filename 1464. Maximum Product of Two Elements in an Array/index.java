/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * self
 */
class Solution {
  public int maxProduct(int[] nums) {
    Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
    for (int val : nums) {
      queue.offer(val);
    }
    int sum = 1;
    int i = 0;
    while (i <= 1) {
      int max = queue.poll();
      sum *= (max - 1);
      i++;
    }
    return sum;
  }
}