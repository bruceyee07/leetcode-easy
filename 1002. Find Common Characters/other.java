/**
 * https://leetcode.com/problems/find-common-characters/
 * https://leetcode.com/problems/find-common-characters/discuss/247558/JavaPython-3-12-liner-and-7-liner-count-and-look-for-minimum.
 */
class Solution {
  public List<String> commonChars(String[] words) {
    List<String> ans = new ArrayList<>();
    int[] count = new int[26];
    Arrays.fill(count, Integer.MAX_VALUE);
    for (String word : words) {
      int[] cnt = new int[26];
      word.chars().forEach(c -> cnt[c - 'a']++);
      for (int i = 0; i < 26; i++) {
        count[i] = Math.min(count[i], cnt[i]);
      }
    }
    for (char c = 'a'; c <= 'z'; c++) {
      while (count[c - 'a']-- > 0) {
        ans.add(String.valueOf(c));
      }
    }
    return ans;
  }
}