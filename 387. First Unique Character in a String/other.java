/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * https://leetcode.com/problems/first-unique-character-in-a-string/solution/ @kevlar_ksb
 */
class Solution {
  public int firstUniqChar(String s) {
    int[] arr = new int[26];
    int n = s.length();
    for (int i = 0; i < n; i++) {
      arr[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < n; i++) {
      if (arr[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}