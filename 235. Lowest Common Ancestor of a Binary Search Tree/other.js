/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * @tutorial https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/solution/
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
  var node = root;
  while (node) {
    if (p.val > node.val && q.val > node.val) {
      node = node.right;
    } else if (p.val < node.val && q.val < node.val) {
      node = node.left;
    } else {
      return node;
    }
  }
  return null;
};