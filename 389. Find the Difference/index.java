/**
 * https://leetcode.com/problems/find-the-difference/
 * self
 */
class Solution {
  public char findTheDifference(String s, String t) {
    String[] sArr = s.split("");
    String[] tArr = t.split("");
    Arrays.sort(sArr);
    Arrays.sort(tArr);
    for (int i = 0; i < sArr.length; i++) {
      if (!sArr[i].equals(tArr[i])) {
        return tArr[i].charAt(0);
      }
    }
    return tArr[tArr.length - 1].charAt(0);
  }
}