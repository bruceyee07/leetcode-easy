/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/same-tree/
 * @type self
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
  var preP = preorder(p);
  var preQ = preorder(q);
  var inP = inorder(p);
  var inQ = inorder(q);
  
  return preP.toString() === preQ.toString() && inP.toString() === inQ.toString();
};

function preorder(root) {
  if (!root) {
    return [null];
  }
  return [root.val].concat(preorder(root.left), preorder(root.right));
}

function inorder(root) {
  if (!root) {
    return [null];
  }
  return inorder(root.left).concat([root.val], inorder(root.right));
}