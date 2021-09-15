/**
 * https://leetcode.com/problems/valid-anagram/
 * self
 */
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    String[] sArr = s.split("");
    String[] tArr = t.split("");
    Arrays.sort(sArr);
    Arrays.sort(tArr);
    for (int i = 0; i < sArr.length; i++) {
      if (!sArr[i].equals(tArr[i])) {
        return false;
      }
    }
    return true;
  }
}