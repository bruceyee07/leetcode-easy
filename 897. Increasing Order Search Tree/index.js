/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/increasing-order-search-tree/
 * @type self
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var increasingBST = function(root) {
  var inorderRes = inorderTraversal(root);
  var dummy = new TreeNode(-1);
  var tree = dummy;

  for (let i = 0; i < inorderRes.length; i++) {
    tree.right = new TreeNode(inorderRes[i]);
    tree = tree.right;
  }

  return dummy.right;
};

function inorderTraversal(root) {
  if (!root) {
    return [];
  }
  return inorderTraversal(root.left).concat([root.val]).concat(inorderTraversal(root.right));
}