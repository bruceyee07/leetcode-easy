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
 * https://leetcode.com/problems/invert-binary-tree/
 * https://leetcode.com/problems/invert-binary-tree/solution/
 */
class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      TreeNode temp = current.left;
      current.left = current.right;
      current.right = temp;
      if (current.left != null) queue.add(current.left);
      if (current.right != null) queue.add(current.right);
    }
    return root;
  }
}