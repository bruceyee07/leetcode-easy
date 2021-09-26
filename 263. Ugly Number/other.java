/**
 * https://leetcode.com/problems/ugly-number/
 * https://leetcode.com/problems/ugly-number/discuss/69214/2-4-lines-every-language
 */
class Solution {
  public boolean isUgly(int n) {
    for (int p = 2; p < 6 && n > 0; p++) {
      while (n % p == 0)
        n /= p; 
    }
    return n == 1;
  }
}