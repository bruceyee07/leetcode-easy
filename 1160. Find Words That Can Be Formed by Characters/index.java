/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * self
 */
class Solution {
  public int countCharacters(String[] words, String chars) {
    HashMap<String, Integer> map = new HashMap<>();
    for (char ch : chars.toCharArray()) {
      String key = String.valueOf(ch);
      map.put(key, map.getOrDefault(key, 0) + 1);
    }
    ArrayList<String> ans = new ArrayList<>();
    for (String word : words) {
      if (checkCanBeFormed(word, map)) {
        ans.add(word);
      }
    }
    int count = 0;
    for (String s : ans) {
      count += s.length();
    }
    return count;
  }

  public boolean checkCanBeFormed(String word, HashMap<String, Integer> map) {
    HashMap<String, Integer> wordMap = new HashMap<>();
    for (char w : word.toCharArray()) {
      String key = String.valueOf(w);
      wordMap.put(key, wordMap.getOrDefault(key, 0) + 1);
    }
    for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
      if (map.get(entry.getKey()) == null || map.get(entry.getKey()) < entry.getValue()) {
        return false;
      }
    }
    return true;
  }
}