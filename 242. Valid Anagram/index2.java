/**
 * https://leetcode.com/problems/valid-anagram/
 * self
 */
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    for (char c : s.toCharArray()) {
      map1.put(c, map1.getOrDefault(c, 0) + 1);
    }
    for (char c : t.toCharArray()) {
      map2.put(c, map2.getOrDefault(c, 0) + 1);
    }
    for (char c : map1.keySet()) {
      if (!map1.get(c).equals(map2.get(c))) {
        return false;
      }
    }
    for (char c : map2.keySet()) {
      if (!map2.get(c).equals(map1.get(c))) {
        return false;
      }
    }
    return true;
  }
}