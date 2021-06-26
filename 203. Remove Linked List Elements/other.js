/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/remove-linked-list-elements/
 * @tutorial https://leetcode.com/problems/remove-linked-list-elements/discuss/57306/3-line-recursive-solution
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
  if (head === null) {
    return null;
  }
  let next = removeElements(head.next, val);
  if (head.val === val) {
    return next;
  }
  head.next = next;
  return head;
};