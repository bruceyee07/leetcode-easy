/**
 * https://leetcode.com/problems/fair-candy-swap/
 * https://leetcode.com/problems/fair-candy-swap/solution/
 */
class Solution {
  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int asum = 0, bsum = 0;
    for (int x : aliceSizes) asum += x;
    for (int x : bobSizes) bsum += x;
    int delta = (bsum - asum) / 2;
    Set<Integer> bset = new HashSet<>();
    for (int x : bobSizes) bset.add(x);
    for (int x : aliceSizes) {
      if (bset.contains(x + delta)) {
        return new int[]{x, x + delta};
      }
    }
    throw null;
  }
}