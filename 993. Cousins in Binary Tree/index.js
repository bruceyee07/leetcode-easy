/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} x
 * @param {number} y
 * @return {boolean}
 */
/**
 * https://leetcode.com/problems/cousins-in-binary-tree/
 * @type self
 */
var isCousins = function(root, x, y) {
  if (!root.left || !root.right) {
    return false;
  }
  var levelorderArr = levelorder(root);
  var depthX = levelorderArr.findIndex(levelItems => levelItems.includes(x));
  var depthY = levelorderArr.findIndex(levelItems => levelItems.includes(y));
  if (depthX !== depthY) {
    return false;
  }
  var levelItems = levelorderArr[depthX];
  var indexX = levelItems.findIndex(item => item === x);
  var indexY = levelItems.findIndex(item => item === y);
  if (Math.abs(indexX - indexY) <= 1) {
    if (indexX < indexY) {
      if (indexX % 2 === 0) {
        return false;
      }
      return true;
    } else {
      if (indexY % 2 === 0) {
        return false;
      }
      return true;
    }
  }
  return true;
};

function levelorder(root) {
  var res = [];
  var unvisited = [root];
  var height = getTreeHeight(root);
  while (unvisited.length) {
    res.push([]);
    var currentLevelSize = unvisited.length;
    for (let i = 0; i < currentLevelSize; i++) {
      var node = unvisited.shift();
      res[res.length - 1].push(node ? node.val : null);
      if (node && node.left) {
        unvisited.push(node.left);
      } else if (res.length < height) {
        unvisited.push(null);
      }
      if (node && node.right) {
        unvisited.push(node.right);
      } else if (res.length < height) {
        unvisited.push(null);
      }
    }
  }
  return res;
}

function getTreeHeight(root) {
  if (!root) {
    return 0;
  }
  return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
}