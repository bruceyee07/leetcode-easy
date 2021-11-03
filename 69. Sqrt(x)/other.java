/**
 * https://leetcode.com/problems/sqrtx/
 * https://leetcode.com/problems/sqrtx/discuss/25057/3-4-short-lines-Integer-Newton-Every-Language
 */
class Solution {
  public int mySqrt(int x) {
    long r = x;
    while (r * r > x) {
      r = (r + x / r) / 2;
    }
    return (int)r;
  }
}