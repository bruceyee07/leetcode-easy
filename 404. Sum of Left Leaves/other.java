/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * https://leetcode.com/problems/sum-of-left-leaves/discuss/88950/Java-iterative-and-recursive-solutions
 */ 
class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    
    int ans = 0;
    if(root.left != null) {
      if(root.left.left == null && root.left.right == null) ans += root.left.val;
      else ans += sumOfLeftLeaves(root.left);
    }
    ans += sumOfLeftLeaves(root.right);
    
    return ans;
  }
}

/**
 * Recursive method. For given node we check whether its left child is a leaf. If it is the case, we add its value to answer, 
 * otherwise recursively call method on left child. For right child we call method only if it has at least one nonnull child.
 */