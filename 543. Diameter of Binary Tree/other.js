/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/diameter-of-binary-tree/
 * @tutorial https://leetcode.com/problems/diameter-of-binary-tree/discuss/101132/Java-Solution-MaxDepth
 * @param {TreeNode} root
 * @return {number}
 */
var diameterOfBinaryTree = function(root) {
  var diameter = 0;
  function dfs(root) {
    if (!root) return;
    var left = maxDepth(root.left);
    var right = maxDepth(root.right);
    diameter = Math.max(diameter, left + right);
    dfs(root.left);
    dfs(root.right);
  }
  dfs(root);
  return diameter;
};

function maxDepth(root) {
  if (!root) return 0;
  return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}

// other version
var diameterOfBinaryTree = function(root) {
  var diameter = 0;
  function maxDepth(root) {
    if (!root) return 0;
    var left = maxDepth(root.left);
    var right = maxDepth(root.right);
    diameter = Math.max(diameter, left + right);
    return Math.max(left, right) + 1;
  }
  maxDepth(root);
  return diameter;
};