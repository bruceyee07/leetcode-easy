/**
 * https://leetcode.com/problems/unique-morse-code-words/
 * self
 */
class Solution {
  public int uniqueMorseRepresentations(String[] words) {
    String[] MORSE = new String[]{
      ".-","-...","-.-.","-..",".","..-.","--.",
      "....","..",".---","-.-",".-..","--","-.",
      "---",".--.","--.-",".-.","...","-","..-",
      "...-",".--","-..-","-.--","--.."
    };

    HashSet<String> set = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String code = "";
      for (char w : word.toCharArray()) {
        code += MORSE[Integer.valueOf(w) - Integer.valueOf('a')];
      }

      set.add(code);
    }

    return set.size();
  }
}