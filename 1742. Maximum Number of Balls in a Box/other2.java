/**
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/discuss/1043101/Java-Straightforward-Solution
 */
class Solution {
  public int countBalls(int lowLimit, int highLimit) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    for (int i = lowLimit; i <= highLimit; i++) {
      int sum = digitSum(i);
      map.put(sum, map.getOrDefault(sum, 0) + 1);
      max = Math.max(max, map.get(sum));
    }

    return max;
  }

  public int digitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}