/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/leaf-similar-trees/
 * @type self
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
var leafSimilar = function(root1, root2) {
  var preorder1 = preorderVariant(root1);
  var preorder2 = preorderVariant(root2);

  for (let i = 0; i < preorder1.length; i++) {
    if (preorder1[i].val !== preorder2[i].val) {
      return false;
    }
  }

  return true;
};

function preorderVariant(root) {
  if (!root) {
    return [];
  }
  return [root].concat(preorderVariant(root.left)).concat(preorderVariant(root.right)).filter(node => node && !node.left && !node.right);
}