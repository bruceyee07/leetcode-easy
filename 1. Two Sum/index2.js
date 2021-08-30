/**
 * @description https://leetcode.com/problems/two-sum/
 * @type self
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  var map = {};
  for (let i = 0; i < nums.length; i++) {
    if (typeof map[target - nums[i]] !== 'undefined') {
      return [i, map[target - nums[i]]];
    }
    map[nums[i]] = i;
  }
  return [];
};