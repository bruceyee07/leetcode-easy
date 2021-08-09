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
 * @type self
 * @param {TreeNode} root
 * @return {number}
 */
var findSecondMinimumValue = function(root) {
  if (!root || !root.left) {
    return -1;
  }
  var leftValue = root.left.val;
  var rightValue = root.right.val;
  if (leftValue > root.val && rightValue > root.val) {
    return leftValue <= rightValue ? leftValue : rightValue;
  }
  if (leftValue > root.val) {
    return leftValue;
  }
  if (rightValue > root.val) {
    return rightValue;
  }
  var leftSecondMinimumValue = findSecondMinimumValue(root.left);
  var rightSecondMinimumValue = findSecondMinimumValue(root.right);
  if (leftSecondMinimumValue === -1 && rightSecondMinimumValue === -1) {
    return -1;
  }
  if (leftSecondMinimumValue === -1) {
    return root.right.val;
  }
  if (rightSecondMinimumValue === -1) {
    return root.left.val;
  }
  return leftSecondMinimumValue <= rightSecondMinimumValue ? leftSecondMinimumValue : rightSecondMinimumValue;
};

/**
 * 38 / 39 test cases passed.
 * Input: [1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1]
 * Output: 3
 * Expected: 2
 */