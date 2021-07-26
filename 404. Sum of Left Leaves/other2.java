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
    if (root == null) return 0;
    int ans = 0;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    
    while (!stack.empty()) {
      TreeNode node = stack.pop();
      if(node.left != null) {
        if (node.left.left == null && node.left.right == null)
          ans += node.left.val;
        else
          stack.push(node.left);
      }
      if (node.right != null) {
        if (node.right.left != null || node.right.right != null)
          stack.push(node.right);
      }
    }
    return ans;
  }
}

/**
 * Iterative method. Here for each node in the tree we check whether its left child is a leaf. If it is true, we add its value to answer, 
 * otherwise add left child to the stack to process it later. For right child we add it to stack only if it is not a leaf.
 */