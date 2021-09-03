/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * self
 */
class Solution {
  public boolean checkIfPangram(String sentence) {
    HashSet<Character> set = new HashSet<>();
    for (char ch : sentence.toCharArray()) {
      set.add(ch);
    }
    return set.size() == 26;
  }
}