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
 * self
 */
class Solution {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    queue.offer(subRoot);
    
    while (!queue.isEmpty()) {
      TreeNode m = queue.poll();
      TreeNode n = queue.poll();
      if (m == null) return false;
      if (isSameTree(m, n)) return true;
      queue.offer(m.left);
      queue.offer(n);
      queue.offer(m.right);
      queue.offer(n);
    }

    return false;
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}