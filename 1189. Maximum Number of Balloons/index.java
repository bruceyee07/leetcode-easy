/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 * self
 */
class Solution {
  public int maxNumberOfBalloons(String text) {
    String target = "balon";
    Map<Character, Integer> map = new HashMap<>();
    for (char c : text.toCharArray()) {
      if (target.indexOf(c) > -1) {
        map.put(c, map.getOrDefault(c, 0) + 1);
      }
    }
    int[] arr = new int[5]; // 'b' 'a' 'l' 'o' 'n'
    for (int i = 0; i < target.length(); i++) {
      arr[i] = map.getOrDefault(target.charAt(i), 0);
    }
    for (int i = 0; i < arr.length; i++) {
      if (i == 2 || i == 3) {
        arr[i] = arr[i] / 2;
      }
    }
    return Arrays.stream(arr).min().getAsInt();
  }
}