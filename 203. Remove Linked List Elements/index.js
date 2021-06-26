/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/remove-linked-list-elements/
 * @type self
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
  if (head === null) {
    return null;
  }
  if (head.next === null) {
    if (head.val === val) {
      return null;
    } else {
      return head;
    }
  }

  let temp = head;
  let node = null;


  while (temp) {
    if (temp.val !== val) {
      if (node === null) {
        node = new ListNode(temp.val);
      } else {
        var tailNode = getTailNode(node);
        tailNode.next = new ListNode(temp.val);
      }
    }
    temp = temp.next;
  }
  
  return node;
};

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val);
  this.next = (next === undefined ? null : next);
}

function getTailNode(head) {
  let node = head;
  while (node) {
    if (node.next === null) {
      return node;
    } else {
      node = node.next;
    }
  }
  return null;
}

/**
 * HIGHLY DO NOT RECOMMEND THIS SOLUTION !!!
 * Runtime: 352 ms, faster than 5.53% of JavaScript online submissions for Remove Linked List Elements.
 * Memory Usage: 44.2 MB, less than 6.97% of JavaScript online submissions for Remove Linked List Elements.
 */