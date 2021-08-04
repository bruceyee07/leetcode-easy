/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/symmetric-tree/
 * @type self
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
  if (!root.left && !root.right) {
    return true;
  }
  var preorderArr = preorder(root.left);
  var postorderArr = postorder(root.right).reverse();
  return preorderArr.toString() === postorderArr.toString();
};

function preorder(root) {
  if (!root) {
    return [null];
  }
  return [root.val].concat(preorder(root.left), preorder(root.right));
}

function postorder(root) {
  if (!root) {
    return [null];
  }
  return postorder(root.left).concat(postorder(root.right), [root.val]);
}