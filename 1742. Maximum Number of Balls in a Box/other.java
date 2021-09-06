/**
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/discuss/1042954/JavaPython-3-Two-codes-w-brief-explanation-and-analysis.
 */
class Solution {
  public int countBalls(int lowLimit, int highLimit) {
    int[] count = new int[46];
    int max = 0;
    for (int i = lowLimit; i <= highLimit; i++) {
      int num = i, sum = 0;
      while (num > 0) {
        sum += num % 10;
        num /= 10;
      }
      max = Math.max(max, ++count[sum]);
    }
    return max;
  }
}