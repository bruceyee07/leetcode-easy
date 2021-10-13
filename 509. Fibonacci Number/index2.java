/**
 * https://leetcode.com/problems/fibonacci-number/
 * self
 */
class Solution {
  public int fib(int n) {
    if (n == 0)
      return 0;
    if (n == 1 || n == 2)
      return 1;
    int prev = 1, cur = 1;
    for (int i = 3; i <= n; i++) {
      int sum = prev + cur;
      prev = cur;
      cur = sum;
    }
    return cur;
  }
}