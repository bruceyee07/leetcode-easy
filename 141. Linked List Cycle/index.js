/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/linked-list-cycle/
 * @type self
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
  if (head === null || head.next === null) {
    return false;
  }

  var fastPtr = slowPtr = head;

  while (fastPtr && slowPtr) {
    fastPtr = fastPtr.next ? fastPtr.next.next : null;
    slowPtr = slowPtr.next || null;
    if (fastPtr === slowPtr) {
      return true;
    }
  }

  return false;
};

/**
 * I found the solution provided by jianchao-li is more concise, which in 
 * https://leetcode.com/problems/linked-list-cycle/discuss/44489/O(1)-Space-Solution
 */
var hasCycle2 = function(head) {
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