/**
 * @description https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * @type self
 * @param {number} k
 * @param {number[]} nums
 */
var KthLargest = function(k, nums) {
  this.k = k;
  if (!nums.length) {
    this.nums = [];
  } else {
    this.nums = nums.sort((a, b) => b - a);
  }
};

/** 
 * @param {number} val
 * @return {number}
 */
KthLargest.prototype.add = function(val) {
  var index = this.nums.findIndex(num => num <= val);
  if (index > -1) {
    this.nums[index + 1] = this.nums[index];
    this.nums[index] = val;
  } else {
    if (this.nums.length === 0) {
      this.nums[0] = val;
    } else {
      this.nums.push(val);
    }
  }
  return this.nums[this.k - 1];
};

/** 
 * Your KthLargest object will be instantiated and called as such:
 * var obj = new KthLargest(k, nums)
 * var param_1 = obj.add(val)
 */