/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/binary-tree-inorder-traversal/
 * @type self
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
  if (root === null) {
    return [];
  }
  if (this.left === null && this.right === null) {
    return [root.val];
  }
  return inorderTraversal(root.left).concat([root.val]).concat(inorderTraversal(root.right));
};