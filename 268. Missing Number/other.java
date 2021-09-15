/**
 * https://leetcode.com/problems/missing-number/
 * https://leetcode.com/problems/missing-number/discuss/69791/4-Line-Simple-Java-Bit-Manipulate-Solution-with-Explaination
 */
class Solution {
  public int missingNumber(int[] nums) {
    int xor = 0, i = 0;
    for (i = 0; i < nums.length; i++) {
      xor = xor ^ i ^ nums[i];
    }
	  return xor ^ i;
  }
}