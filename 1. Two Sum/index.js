/**
 * @description https://leetcode.com/problems/two-sum/
 * @type self
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    var remain = target - nums[i];
    var index = nums.findIndex(val => val === remain);
    if (index > -1 && index !== i) {
      return [i, index];
    }
    continue;
  }
};