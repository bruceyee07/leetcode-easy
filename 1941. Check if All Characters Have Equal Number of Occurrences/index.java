/**
 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 * self
 */
class Solution {
  public boolean areOccurrencesEqual(String s) {
    HashMap<String, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      String str = String.valueOf(ch);
      if (map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
      } else {
        map.put(str, 1);
      }
    }

    int count = map.get(String.valueOf(s.charAt(0)));

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      Integer value = entry.getValue();
      if (value != count) {
        return false;
      }
    } 
    return true;
  }
}