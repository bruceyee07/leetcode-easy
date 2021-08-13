/**
 * @description https://leetcode.com/problems/min-stack/
 * @type self
 * initialize your data structure here.
 */
var MinStack = function() {
  this.data = [];
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
  this.data.unshift(val);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
  this.data.splice(0, 1);
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
  return this.data[0];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
  return Math.min(...this.data);
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */