/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/binary-tree-preorder-traversal/
 * @type self
 * @param {TreeNode} root
 * @return {number[]}
 */
var preorderTraversal = function(root) {
  if (root === null) {
    return [];
  }
  if (root.left === null && root.right === null) {
    return [root.val];
  }
  return [root.val].concat(preorderTraversal(root.left)).concat(preorderTraversal(root.right));
};