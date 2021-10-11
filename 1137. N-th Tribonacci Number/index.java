/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 * self
 */
class Solution {
  public int tribonacci(int n) {
    int[] cache = new int[38];
    cache[0] = 0;
    cache[1] = 1;
    cache[2] = 1;
    for (int i = 3; i < 38; i++) {
      cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
    }
    return cache[n];
  }
}