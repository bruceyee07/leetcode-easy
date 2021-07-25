/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/sum-of-left-leaves/
 * @tutorial https://leetcode.com/problems/sum-of-left-leaves/discuss/88950/Java-iterative-and-recursive-solutions
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfLeftLeaves = function(root) {
  if (!root) {
    return 0;
  }

  var ans = 0;
  if (root.left) {
    if (root.left.left === null && root.left.right === null) {
      ans += root.left.val;
    } else {
      ans += sumOfLeftLeaves(root.left);
    }
  }
  ans += sumOfLeftLeaves(root.right);

  return ans;
};