/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @type self (it means I solved this problem independently)
 * @param {ListNode} head
 * @return {number}
 */
var getDecimalValue = function(head) {
  let sum = 0;
  let node = head;
  let weight = getNodeSize(head);

  while (node !== null) {
    sum += node.val * (2 ** (weight - 1));
    weight--;
    node = node.next;
  }

  return sum;
};

function getNodeSize(head) {
  let size = 0;
  let node = head;
  while (node !== null) {
    size++;
    node = node.next;
  }
  return size;
}