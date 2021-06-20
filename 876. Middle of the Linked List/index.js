/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/middle-of-the-linked-list/
 * @type self
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
  var size = getNodeSize(head);
  var middleIndex = Math.ceil((size + 1) / 2) - 1;
  return getNodeAtIndex(head, middleIndex );
};

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val);
  this.next = (next === undefined ? null : next);
}

function getNodeAtIndex(head, index) {
  let node = head;
  let cursor = 0;

  while (cursor !== index) {
    node = node.next;
    cursor++;
  }

  return node;
}

function getNodeSize(head) {
  let size = 0;
  let node = head;
  while (node !== null) {
    size++;
    node = node.next;
  }
  return size;
}