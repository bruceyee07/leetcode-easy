/**
 * https://leetcode.com/problems/sqrtx/
 * self
 */
class Solution {
  public int mySqrt(int x) {
    if (x == 0 || x == 1) return x;
    for (int i = 1; i < x; i++) {
      if (i * i < x) continue;
      if (i * i == x) return i;
      return i - 1; 
    }
    return -1;
  }
}