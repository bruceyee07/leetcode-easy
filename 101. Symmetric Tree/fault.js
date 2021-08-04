/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/symmetric-tree/
 * @type self
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
  if (!root.left && !root.right) {
    return true;
  }
  var levelorderArr = levelorder(root);
  console.log(levelorderArr);
  for (let i = 1; i < levelorderArr.length; i++) {
    var currentLevelSize = levelorderArr[i].length;
    if (currentLevelSize % 2 !== 0) {
      return false;
    }
    for (let j = 0; j < currentLevelSize / 2; j++) {
      if (levelorderArr[i][j] !== levelorderArr[i][currentLevelSize - 1 - j]) {
        return false;
      }
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

/**
 * 183 / 197 test cases passed.
 * 
 * last executed input:
 * [9,14,14,74,null,null,74,null,12,12,null,63,null,null,63,-8,null,null,-8,-53,null,null,-53,null,-96,-96,null,-65,null,null,-65,98,null,null,98,50,null,null,50,null,91,91,null,41,-30,-30,41,null,86,null,-36,-36,null,86,null,-78,null,9,null,null,9,null,-78,47,null,48,-79,-79,48,null,47,-100,-86,null,47,null,67,67,null,47,null,-86,-100,-28,11,null,56,null,30,null,64,64,null,30,null,56,null,11,-28,43,54,null,-50,44,-58,63,null,null,-43,-43,null,null,63,-58,44,-50,null,54,43]
 */