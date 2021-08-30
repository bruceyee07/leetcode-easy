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
    this.nums = insertSort(this.nums, val);
    return this.nums[this.k - 1];
  };
  
  function insertSort(arr, val) {
    var lastIndex = arr.length - 1;
    while (val > arr[lastIndex]) {
      arr[lastIndex + 1] = arr[lastIndex];
      lastIndex--;
    }
    arr[lastIndex + 1] = val;
    return arr;
  }
  
  /** 
   * Your KthLargest object will be instantiated and called as such:
   * var obj = new KthLargest(k, nums)
   * var param_1 = obj.add(val)
   */