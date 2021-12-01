/**
 * https://leetcode.com/problems/reorder-data-in-log-files/
 * https://leetcode.com/problems/reorder-data-in-log-files/discuss/193872/Java-Nothing-Fancy-15-lines-2ms-all-clear.
 * self
 */
class Solution {
  public String[] reorderLogFiles(String[] logs) {
    Arrays.sort(logs, (a, b) -> {
      int aSpaceIndex = a.indexOf(' '), bSpaceIndex = b.indexOf(' ');
      char aFirstCharacter = a.charAt(aSpaceIndex + 1), bFirstCharacter = b.charAt(bSpaceIndex + 1); 
      if (aFirstCharacter <= '9') {
        if (bFirstCharacter <= '9') return 0;
        return 1;
      }
      if (bFirstCharacter <= '9') return -1;
      int order = a.substring(aSpaceIndex + 1).compareTo(b.substring(bSpaceIndex + 1));
      if (order == 0) return a.substring(0, aSpaceIndex).compareTo(b.substring(0, bSpaceIndex));
      return order;
    });
    return logs;
  }
}