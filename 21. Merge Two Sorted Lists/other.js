/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/merge-two-sorted-lists/
 * @tutorial https://leetcode.com/problems/merge-two-sorted-lists/discuss/9715/Java-1-ms-4-lines-codes-using-recursion
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
  if (l1 === null) {
    return l2;
  }
  if (l2 === null) {
    return l1;
  }
  if (l1.val < l2.val) {
    l1.next = mergeTwoLists(l1.next, l2);
    return l1;
  } else {
    l2.next = mergeTwoLists(l1, l2.next);
    return l2;
  }
};

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/merge-two-sorted-lists/
 * @tutorial https://leetcode.com/problems/merge-two-sorted-lists/discuss/9735/Python-solutions-(iteratively-recursively-iteratively-in-place).
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
  var dummy = cur = new ListNode(0);
  while (l1 && l2) {
    if (l1.val < l2.val) {
      cur.next = l1;
      l1 = l1.next;
    } else {
      cur.next = l2;
      l2 = l2.next;
    }
    console.log('======= cur 1 =========', cur);
    console.log('======= dummy 1 =========', dummy);

    cur = cur.next;

    console.log('======= cur 2 =========', cur);
    console.log('======= dummy 2 =========', dummy);
  }
  cur.next = l1 || l2;
  console.log('======= cur 3 =========', cur);
  console.log('======= dummy =========', dummy);
  return dummy.next;
};

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val);
  this.next = (next === undefined ? null : next);
}

// [1,2,4]
// [1,3,4]
// ======= cur 1 ========= [0,1,3,4]
// ======= dummy 1 ========= [0,1,3,4]
// ======= cur 2 ========= [1,3,4]
// ======= dummy 2 ========= [0,1,3,4]
// ======= cur 1 ========= [1,1,2,4]
// ======= dummy 1 ========= [0,1,1,2,4]
// ======= cur 2 ========= [1,2,4]
// ======= dummy 2 ========= [0,1,1,2,4]
// ======= cur 1 ========= [1,2,4]
// ======= dummy 1 ========= [0,1,1,2,4]
// ======= cur 2 ========= [2,4]
// ======= dummy 2 ========= [0,1,1,2,4]
// ======= cur 1 ========= [2,3,4]
// ======= dummy 1 ========= [0,1,1,2,3,4]
// ======= cur 2 ========= [3,4]
// ======= dummy 2 ========= [0,1,1,2,3,4]
// ======= cur 1 ========= [3,4]
// ======= dummy 1 ========= [0,1,1,2,3,4]
// ======= cur 2 ========= [4]
// ======= dummy 2 ========= [0,1,1,2,3,4]
// ======= cur 3 ========= [4,4]
// ======= dummy ========= [0,1,1,2,3,4,4]


// l2 1 -> l1 1 -> l1 2 -> l2 3 -> l2 4 -> l1 4