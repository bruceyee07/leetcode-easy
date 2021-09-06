/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * self
 */

class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      if (map.containsKey(val)) {
        map.put(val, map.get(val) + 1);
      } else {
        map.put(val, 1);
      }
    }

    HashSet<Integer> set = new HashSet<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      set.add(entry.getValue());
    }

    return map.size() == set.size();
  }
}