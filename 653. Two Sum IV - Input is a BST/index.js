/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * @type self
 * @param {TreeNode} root
 * @param {number} k
 * @return {boolean}
 */
var findTarget = function(root, k) {
  var inorderRes = inorder(root);

  for (let i = 0; i < inorderRes.length - 1; i++) {
    var current =inorderRes[i];
    var target = k - current;
    if (inorderRes.slice(i + 1).includes(target)) {
      return true;
    } else {
      continue;
    }
  }

  return false;
};

function inorder(root) {
  if (!root) {
    return [];
  }
  return inorder(root.left).concat([root.val], inorder(root.right));
}