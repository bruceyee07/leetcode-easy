/**
 * https://leetcode.com/problems/fair-candy-swap/
 * self
 */
class Solution {
  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int asum = Arrays.stream(aliceSizes).sum();
    int bsum = Arrays.stream(bobSizes).sum();
    int average = (asum + bsum) / 2;
    int agap = average - asum;
    int bgap = average - bsum;
    int [] res = new int[2];

    for (int i : aliceSizes) {
      int target = agap + i;
      int findTarget = Arrays.stream(bobSizes).filter(x -> x == target).findFirst().orElse(0);
      if (findTarget != 0) {
        res[0] = i;
        res[1] = target;
        break;
      }
    }
    
    return res;
  }
}