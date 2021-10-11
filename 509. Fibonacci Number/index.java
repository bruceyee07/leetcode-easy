/**
 * https://leetcode.com/problems/fibonacci-number/
 * self
 */
class Solution {
  public int fib(int n) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 0);
    map.put(1, 1);
    for (int i = 2; i <= n; i++) {
      map.put(i, map.get(i - 1) + map.get(i - 2));
    }
    return map.get(n);
  }
}