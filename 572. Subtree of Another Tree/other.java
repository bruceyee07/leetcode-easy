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
 * https://leetcode.com/problems/subtree-of-another-tree/
 * https://leetcode.com/problems/subtree-of-another-tree/discuss/664582/Intuitive-Java-Fully-Iterative-Solution-Accepted
 */
class Solution {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    boolean same = false;
    
    while (!queue.isEmpty() && !same) {
      TreeNode node = queue.poll();
      if (node.val == subRoot.val) {
        same = isSameTree(node, subRoot);
      }
      if (node.left != null) queue.offer(node.left);
      if (node.right != null) queue.offer(node.right);
    }

    return same;
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}