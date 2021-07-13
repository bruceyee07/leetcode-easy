/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 * @param {TreeNode} root
 * @return {number}
 */
var sumRootToLeaf = function(root) {
  if (root === null) {
    return 0;
  }
  var depth = getBinaryTreeDepth(root);
  return root.val * ((2 ** (depth - 1)) ** 2) + sumRootToLeaf(root.left) + sumRootToLeaf(root.right); 
};

function getBinaryTreeDepth(root) {
  if (root === null) {
    return 0;
  }

  var level = 1;
  if (root.left || root.right) {
    level+= getBinaryTreeDepth(root.left || root.right)
  }
  return level;
}