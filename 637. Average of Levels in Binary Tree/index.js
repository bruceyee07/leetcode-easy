/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * @type self
 * @param {TreeNode} root
 * @return {number[]}
 */
var averageOfLevels = function(root) {
  var levelOrderRes = levelOrder(root);
  return levelOrderRes.map(level => level.reduce((prev, cur) => prev + cur, 0) / level.length);
};

function levelOrder(root) {
  if (!root) {
    return [];
  }

  var res = [];
  var unvisited = [root];

  while (unvisited.length) {
    res.push([]);

    var currentLevelSize = unvisited.length;
    for (let i = 0; i < currentLevelSize; i++) {
      var current = unvisited.shift();
      res[res.length - 1].push(current.val);
      if (current.left) {
        unvisited.push(current.left);
      }
      if (current.right) {
        unvisited.push(current.right);
      }
    }
  }

  return res;
}