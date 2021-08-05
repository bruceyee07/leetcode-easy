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
 * https://leetcode.com/problems/cousins-in-binary-tree/
 * https://leetcode.com/problems/cousins-in-binary-tree/discuss/239376/Java-BFS-time-and-space-beat-100 @Frimish
 */
class Solution {
  public boolean isCousins(TreeNode root, int A, int B) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      boolean isAexist = false;
      boolean isBexist = false;
      for (int i = 0; i < size; i++) {
        TreeNode cur = queue.poll();
        if (cur.val == A) isAexist = true;
        if (cur.val == B) isBexist = true;
        if (cur.left != null && cur.right != null) {
          if (cur.left.val == A && cur.right.val == B) {
            return false;
          }
          if (cur.left.val == B && cur.right.val == A) {
            return false;
          }
        }
        if (cur.left != null) {
          queue.offer(cur.left);
        }
        if (cur.right != null) {
          queue.offer(cur.right);
        }
      }

      if (isAexist && isBexist) {
        return true;
      }
      if (isAexist || isBexist) {
        return false;
      }
    }

    return false;
  }
}

/**
 * is it a really easy problem ?
 */