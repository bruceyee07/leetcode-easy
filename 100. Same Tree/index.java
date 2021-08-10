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
 * https://leetcode.com/problems/same-tree/
 * https://leetcode.com/problems/same-tree/solution/
 */
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(p);
    queue.offer(q);
    while (!queue.isEmpty()) {
      TreeNode m = queue.poll();
      TreeNode n = queue.poll();
      if (m == null && n == null) continue;
      if (m == null || n == null) return false;
      if (m.val != n.val) return false;
      queue.offer(m.left);
      queue.offer(n.left);
      queue.offer(m.right);
      queue.offer(n.right);
    }
    return true;
  }
}