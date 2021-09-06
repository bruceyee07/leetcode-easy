/**
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 * self
 */
class Solution {
  public int countGoodSubstrings(String s) {
    if (s.length() < 3) {
      return 0;
    }
    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < s.length() - 2; i++) {
      arr.add(s.substring(i, i + 3));
    }

    int count = 0;
    for (String str : arr) {
      if (checkDistinct(str)) {
        count++;
      }
    }
    return count;
  }

  public boolean checkDistinct(String s) {
    HashSet<String> set = new HashSet<>();
    for (char ch : s.toCharArray()) {
      set.add(String.valueOf(ch));
    }
    return set.size() == s.length();
  }
}