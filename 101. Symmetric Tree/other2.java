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
 * https://leetcode.com/problems/symmetric-tree/
 * https://leetcode.com/problems/symmetric-tree/solution/
 */
class Solution {
  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    queue.offer(root);

    while (!queue.isEmpty()) {
      TreeNode node1 = queue.poll();
      TreeNode node2 = queue.poll();
      if (node1 == null && node2 == null) continue;
      if (node1 == null || node2 == null) return false;
      if (node1.val != node2.val) return false;
      queue.offer(node1.left);
      queue.offer(node2.right);
      queue.offer(node1.right);
      queue.offer(node2.left);
    }

    return true;
  }
}