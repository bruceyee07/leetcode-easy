/**
 * https://leetcode.com/problems/jewels-and-stones/
 * self
 */
class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    int res = 0;
    HashSet<Character> set = new HashSet<>();
    for (char ch: jewels.toCharArray()) {
      set.add(ch);
    }
    for (char s: stones.toCharArray()) {
      if (set.contains(s)) res++;
    }
    return res;
  }
}