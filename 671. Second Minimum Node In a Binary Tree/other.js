/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 * @tutorial https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/discuss/107158/Java-divide-and-conquer-solution
 * @param {TreeNode} root
 * @return {number}
 */
var findSecondMinimumValue = function(root) {
  if (!root.left) return -1;
  var left = root.left.val === root.val ? findSecondMinimumValue(root.left) : root.left.val;
  var right = root.right.val === root.val ? findSecondMinimumValue(root.right) : root.right.val;
  return left === -1 || right === -1 ? Math.max(left, right) : Math.min(left, right);
};
