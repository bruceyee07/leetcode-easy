/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @tutorial https://leetcode.com/problems/remove-duplicates-from-sorted-list/solution/
 * @abstract to be honest, I couldn't understant this solution
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
  var current = head;
  
  while (current && current.next) {
    if (current.next.val === current.val) {
      current.next = current.next.next;
    } else {
      current = current.next;
    }

    console.log('======= current ========', current);
  }

  console.log('======= finished current ========', current);
  console.log('======= finished head ========', current);

  return head;
};

function arrayToLinkedList(arr) {
  const length = arr.length;
  if (length === 0) {
    return null;
  }
  var head = new ListNode(arr[length - 1]);
  for (let i = arr.length - 2; i >= 0; i--) {
    head = new ListNode(arr[i], head);
  }
  return head;
}

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val);
  this.next = (next === undefined ? null : next);
}

var head = arrayToLinkedList([1,2,2,3,3,3,5,2,6,6,1]);
var res = deleteDuplicates(head);