/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/balanced-binary-tree/
 * @type self
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
  function dfs(node) {
    if (!node || (!node.left && !node.right)) {
      return true;
    }
    if (!node.left) {
      if (!(node.right.left === null && node.right.right === null)) {
        return false;
      }
    }
    if (!node.right) {
      if (!(node.left.left === null && node.left.right === null)) {
        return false;
      }
    }
    if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
      return false;
    }
    return dfs(node.left) && dfs(node.right);;
  }
  return dfs(root);
};

function getHeight(root) {
  if (!root) {
    return 0;
  }
  return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}