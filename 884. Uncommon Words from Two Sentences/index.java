/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * self
 */
class Solution {
  public String[] uncommonFromSentences(String s1, String s2) {
    String[] a1 = s1.split(" ");
    String[] a2 = s2.split(" ");
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    List<String> list = new ArrayList<>();
    for (String s : a1) map1.put(s, map1.getOrDefault(s, 0) + 1);
    for (String s : a2) map2.put(s, map2.getOrDefault(s, 0) + 1);
    for (String s : map1.keySet()) {
      if (!map2.containsKey(s) && map1.get(s) == 1) {
        list.add(s);
      }
    }
    for (String s : map2.keySet()) {
      if (!map1.containsKey(s) && map2.get(s) == 1) {
        list.add(s);
      }
    }
    return list.toArray(new String[0]);
  }
}