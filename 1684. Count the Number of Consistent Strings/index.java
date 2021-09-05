/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 * self
 */

class Solution {
  public int countConsistentStrings(String allowed, String[] words) {
    HashSet<Character> set = new HashSet<>();
    for (char ch : allowed.toCharArray()) {
      set.add(ch);
    }
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (checkConsistentString(set, word)) {
        count++;
      }
    }
    return count;
  }

  public boolean checkConsistentString(HashSet<Character > set, String word) {
    for (char w : word.toCharArray()) {
      if (!set.contains(w)) {
        return false;
      }
    }
    return true;
  }
}

//  You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

// Return the number of consistent strings in the array words.