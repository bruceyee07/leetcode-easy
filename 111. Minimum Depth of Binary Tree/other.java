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
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/discuss/36071/BFS-C%2B%2B-8ms-Beats-99.94-submissions
 */
class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    int i = 0;
    while (!queue.isEmpty()) {
      i++;
      int k = queue.size();
      for (int j = 0; j < k; j++) {
        TreeNode front = queue.peek();
        if (front.left != null) queue.offer(front.left);
        if (front.right != null) queue.offer(front.right);
        queue.poll();
        if (front.left == null && front.right == null) return i; 
      }
    }
    return -1;
  }
}