/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/palindrome-linked-list/
 * @tutorial https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
  if (head === null || head.next === null) {
    return true;
  }

  let fast = slow = head;
  while (fast && fast.next) {
    slow = slow.next;
    fast = fast.next.next;
  }
  if (fast) {
    slow = slow.next; // odd nodes: let right half smaller
  }

  slow = reverseList(slow);
  fast = head;

  while (slow) {
    if (slow.val !== fast.val) {
      return false;
    }
    slow = slow.next;
    fast = fast.next;
  }
  return true;
};

function reverseList(head) {
  var prev = null;
  var cur = head;
  
  while (cur) {
    var next = cur.next;
    cur.next = prev;
    prev = cur;
    cur = next;
  }
  return prev;
}