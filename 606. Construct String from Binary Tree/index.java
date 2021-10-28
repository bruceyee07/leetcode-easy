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
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * https://leetcode.com/problems/construct-string-from-binary-tree/discuss/103992/Java-Solution-Tree-Traversal
 */
class Solution {
  public String tree2str(TreeNode root) {
    if (root == null) return "";
    String s = root.val + "";
    String left = tree2str(root.left);
    String right = tree2str(root.right);
    if (left == "" && right == "") return s;
    if (left == "") return s + "()" + "(" + right + ")";
    if (right == "") return s + "(" + left + ")";
    return s + "(" + left + ")" + "(" + right + ")";
  }
}