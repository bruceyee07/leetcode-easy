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
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/discuss/270025/JavaC%2B%2BPython-Recursive-Solution
 */
class Solution {
  public int sumRootToLeaf(TreeNode root) {
    return dfs(root, 0);
  }
  public int dfs(TreeNode root, int val) {
    if (root == null) return 0;
    val = val * 2 + root.val;
    return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right, val);
  }
}

/**
 * Intuition
 * Easily decompose this problem into 2 sub-problem:
 * 1. Find all path from root to leaves. DFS recursion should help do that.
 * 2. Transform a path from base to base 10.
 * 
 * You can do this separately, and it will be a O(N^2) solution.
 * In my solution, I combine them together.
 * 
 * Explanation:
 * We recursively pass the current value of path to the children.
 * If root == null, no value, return 0.
 * If root != null,
 * we double the value from its parent and add the node's value,
 * like the process of transforming base 2 to base 10.
 * 
 * In the end of recursion,
 * if root.left == root.right == null,
 * return the current val.
 * 
 * Complexity:
 * Time O(N)
 * Space O(H) for recursion.
 */