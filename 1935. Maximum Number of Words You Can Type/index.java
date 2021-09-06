/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 * self
 */
class Solution {
  public int canBeTypedWords(String text, String brokenLetters) {
    int count = 0;
    String[] words = text.split(" ");
    for (String word : words) {
      if (!checkContains(word, brokenLetters)) {
        count++;
      }
    }
    return count;
  }

  public boolean checkContains(String word, String s) {
    for (char ch : s.toCharArray()) {
      if (word.contains(String.valueOf(ch))) {
        return true;
      }
    }
    return false;
  }
}