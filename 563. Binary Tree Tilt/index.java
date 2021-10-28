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
 * https://leetcode.com/problems/binary-tree-tilt/
 * self
 */
class Solution {
  public int findTilt(TreeNode root) {
    if (root == null) return 0;
    Map<TreeNode, TreeNode[]> m = new HashMap<>();
    m = dfs(root, m);
    int ans = 0;
    for (TreeNode n : m.keySet()) {
      ans += Math.abs(sum(m.get(n)[0]) - sum(m.get(n)[1]));
    }
    return ans;
  }

  public Map<TreeNode, TreeNode[]> dfs(TreeNode root, Map<TreeNode, TreeNode[]> m) {
    if (root == null) return m;
    m.put(root, new TreeNode[]{root.left, root.right});
    dfs(root.left, m);
    dfs(root.right, m);
    return m;
  }

  public int sum(TreeNode node) {
    if (node == null) return 0;
    int ans = node.val;
    ans += sum(node.left);
    ans += sum(node.right);
    return ans;
  }
}