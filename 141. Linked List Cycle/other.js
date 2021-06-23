/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/linked-list-cycle/
 * @tutorial https://leetcode.com/problems/linked-list-cycle/discuss/44489/O(1)-Space-Solution
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
  var fastPtr = slowPtr = head;

  while (fastPtr && fastPtr.next) {
    fastPtr = fastPtr.next.next;
    slowPtr = slowPtr.next;
    if (fastPtr === slowPtr) {
      return true;
    }
  }

  return false;
};