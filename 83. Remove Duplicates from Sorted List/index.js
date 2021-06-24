/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @type self
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
  if (head === null || head.next === null) {
    return head;
  }

  var node = head;
  var nextNode = node.next;

  while (node && nextNode && nextNode.val === node.val) {
    nextNode = nextNode.next;
  }

  node.next = deleteDuplicates(nextNode);

  return node;
};