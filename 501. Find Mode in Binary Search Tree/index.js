/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/find-mode-in-binary-search-tree/
 * @type self
 * @param {TreeNode} root
 * @return {number[]}
 */
var findMode = function(root) {
  var inorderArr = inorder(root);
  var map = {
    [inorderArr[0]]: 1
  };
  var res = [];
  var maxTimes = -Infinity;
  for (let i = 1; i < inorderArr.length; i++) {
    if (!map[inorderArr[i]]) {
      map[inorderArr[i]] = 1;
    } else {
      map[inorderArr[i]]++;
    }
  }
  console.log(map);
  Object.keys(map).forEach(key => {
    if (map[key] > maxTimes) {
      maxTimes = map[key];
      res = [];
      res.push(Number(key));
    } else if (map[key] == maxTimes) {
      res.push(Number(key));
    }
  });
  return res;
};

function inorder(root) {
  if (!root) {
    return [];
  }
  return inorder(root.left).concat([root.val], inorder(root.right));
}