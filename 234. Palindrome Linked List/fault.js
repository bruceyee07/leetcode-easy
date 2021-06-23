/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */

/**
 * @description https://leetcode.com/problems/palindrome-linked-list/
 * @throws Time Limit Exceeded
 * @deprecated https://leetcode.com/submissions/detail/511655287/ 
 */
var isPalindrome = function(head) {
  if (head.next === null) {
    return true;
  }
  const size = getNodeSize(head);

  let flag = true;

  for (let i = 0; i < Math.floor(size / 2); i++) {
    const headNode = getNodeAtIndex(head, i);
    const tailNode = getNodeAtIndex(head, size - 1 -i);
    if (headNode.val !== tailNode.val) {
      return false;
    } else {
      continue;
    }
  }

  return flag;
};

function getNodeSize(head) {
  let size = 0;
  let node = head;

  while (node) {
    size++;
    node = node.next;
  }

  return size;
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