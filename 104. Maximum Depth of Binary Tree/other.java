/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    
    int max = 1;
    
    Stack<TreeNode> nodes = new Stack<>();
    Stack<Integer> depths = new Stack<>();
    
    nodes.push(root);
    depths.push(1);
    
    while (!nodes.empty()) {
      TreeNode curr = nodes.pop();
      int depth = depths.pop();
      
      if (curr.left == null && curr.right == null) {
        max = Math.max(max, depth);
      } 
      
      if (curr.right != null) {
        nodes.push(curr.right);
        depths.push(depth + 1);
      } 
      if (curr.left != null) {
        nodes.push(curr.left);
        depths.push(depth + 1);
      }
    }
    
    return max;
  }
}

/**
 * provided by haoyangfan
 * quote: I am sharing an iterative version of solution with the similar idea. Yes, I even consider it as the
 * translation of above code in iterative way (note the order I push right and push left)
 */