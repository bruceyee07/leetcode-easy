/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @description https://leetcode.com/problems/invert-binary-tree/
 * @tutorial https://leetcode.com/problems/invert-binary-tree/solution/
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function(root) {
  if (!root) {
    return null;
  }
  var queue = new MyQueue();
  queue.push(root);

  while (!queue.empty()) {
    var current = queue.pop();
    var temp = current.left;
    current.left = current.right;
    current.right = temp;
    if (current.left) {
      queue.push(current.left);
    }
    if (current.right) {
      queue.push(current.right);
    }
  }

  return root;
};

/**
 * Initialize your data structure here.
 */
var MyQueue = function() {
	this.stack1 = []
	this.stack2 = []
};

/**
 * Push element x to the back of queue. 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
	this.stack1.push(x)
};

/**
 * Removes the element from in front of queue and returns that element.
 * @return {number}
 */
MyQueue.prototype.pop = function() {
	while(this.stack1.length !== 0){
		this.stack2.push(this.stack1.pop())
	}

	var pop = this.stack2.pop()

	while(this.stack2.length !== 0){
		this.stack1.push(this.stack2.pop())
	}

	return pop
};

/**
 * Get the front element.
 * @return {number}
 */
MyQueue.prototype.peek = function() {
	while(this.stack1.length !== 0){
		this.stack2.push(this.stack1.pop())
	}

	var pop = this.stack2.pop()
	this.stack2.push(pop)
	while(this.stack2.length !== 0){
		this.stack1.push(this.stack2.pop())
	}

	return pop
};

/**
 * Returns whether the queue is empty.
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
	return this.stack1.length === 0 ? true:false
};

/** 
 * Your MyQueue object will be instantiated and called as such:
 * var obj = new MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */