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
 * https://leetcode.com/problems/range-sum-of-bst/
 * https://leetcode.com/problems/range-sum-of-bst/discuss/192019/JavaPython-3-3-similar-recursive-and-1-iterative-methods-w-comment-and-analysis.
 */
class Solution {
  public int rangeSumBST(TreeNode root, int low, int high) {
    Stack<TreeNode> stk = new Stack<>();
    stk.push(root);
    int sum = 0;
    while (!stk.isEmpty()) {
      TreeNode n = stk.pop();
      if (n == null) { continue; }
      if (n.val > low) { stk.push(n.left); }
      if (n.val < high) { stk.push(n.right); }
      if (n.val >= low && n.val <= high) { sum+= n.val; }

    }
    return sum;
  }
}