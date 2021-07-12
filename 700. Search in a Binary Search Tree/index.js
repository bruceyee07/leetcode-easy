/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/search-in-a-binary-search-tree/
 * @type self
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var searchBST = function(root, val) {
  if (!root || root.val === val) {
    return root;
  }
  if (root.val < val) {
    return searchBST(root.right, val);
  }
  return searchBST(root.left, val);
};