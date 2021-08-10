/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/same-tree/
 * @tutorial https://leetcode.com/problems/same-tree/solution/
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
  var queue = new MyQueue();
  queue.offer(p);
  queue.offer(q);
  while (!queue.isEmpty()) {
    var m = queue.poll();
    var n = queue.poll();
    if (m === null && n === null) continue;
    if (m === null || n === null) return false;
    if (m.val !== n.val) return false;
    queue.offer(m.left);
    queue.offer(n.left);
    queue.offer(m.right);
    queue.offer(n.right);
  }
  return true;
}

/**
 * Initialize your data structure here.
 */
var MyQueue = function() {
	this.stack1 = [];
	this.stack2 = [];
};

/**
 * Push element x to the back of queue. 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.offer = function(x) {
	this.stack1.push(x);
};

/**
 * Removes the element from in front of queue and returns that element.
 * @return {number}
 */
MyQueue.prototype.poll = function() {
	while (this.stack1.length !== 0) {
		this.stack2.push(this.stack1.pop());
	}

	var pop = this.stack2.pop();

	while (this.stack2.length !== 0) {
		this.stack1.push(this.stack2.pop());
	}

	return pop;
};

/**
 * Get the front element.
 * @return {number}
 */
MyQueue.prototype.peek = function() {
	while (this.stack1.length !== 0) {
		this.stack2.push(this.stack1.pop());
	}

	var pop = this.stack2.pop();
	this.stack2.push(pop);
	while (this.stack2.length !== 0) {
		this.stack1.push(this.stack2.pop());
	}

	return pop;
};

/**
 * Returns whether the queue is empty.
 * @return {boolean}
 */
MyQueue.prototype.isEmpty = function() {
	return this.stack1.length === 0 ? true : false;
};