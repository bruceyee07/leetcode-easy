/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * @type self
 * @param {TreeNode} root
 * @return {number}
 */
var minDiffInBST = function(root) {
  var inorderRes = inorder(root);
  let min = Infinity;

  for (let i = 0, j = 1; i < inorderRes.length - 1, j < inorderRes.length; i++, j++) {
    if (min > inorderRes[j] - inorderRes[i]) {
      min = inorderRes[j] - inorderRes[i];
    }
  }

  return min;
};

function inorder(root) {
  if (!root) {
    return [];
  }
  return inorder(root.left).concat([root.val], inorder(root.right));
}