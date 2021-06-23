/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/reverse-linked-list/
 * @tutorial https://leetcode.com/problems/reverse-linked-list/solution/
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
  if (head === null || head.next === null) {
    return head;
  }
  var p = reverseList(head.next);
  head.next.next = head;
  head.next = null;
  return p;
};
