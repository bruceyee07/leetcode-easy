/**
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 * self
 */
class Solution {
  public int countBalls(int lowLimit, int highLimit) {
    int[] arr = new int[highLimit - lowLimit + 1];

    for (int ballNumber = lowLimit; ballNumber <= highLimit; ballNumber++) {
      arr[ballNumber - lowLimit] = boxNumber(ballNumber);
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    int max = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
      }
    }
    return max;
  }

  public int boxNumber(int ballNumber) {
    int count = 0;
    String str = String.valueOf(ballNumber);
    for (char ch : str.toCharArray()) {
      count += Integer.valueOf(String.valueOf(ch));
    }
    return count;
  }
}