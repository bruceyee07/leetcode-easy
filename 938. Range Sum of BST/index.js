/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/range-sum-of-bst/
 * @type self
 * @param {TreeNode} root
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var rangeSumBST = function(root, low, high) {
  if (root === null) {
    return 0;
  }
  var rootSum = root.val >= low && root.val <= high ? root.val : 0;
  return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) + rootSum;
};