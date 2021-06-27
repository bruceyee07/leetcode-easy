/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/intersection-of-two-linked-lists/
 * @tutorial https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49792/Concise-JAVA-solution-O(1)-memory-O(n)-time
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
  let sizeA = getNodeSize(headA);
  let sizeB = getNodeSize(headB);
  let nodeA = headA;
  let nodeB = headB;

  while (sizeA > sizeB) {
    nodeA = nodeA.next;
    sizeA--;
  }
  while (sizeB > sizeA) {
    nodeB = nodeB.next;
    sizeB--;
  }
  while (nodeA !== nodeB) {
    nodeA = nodeA.next;
    nodeB = nodeB.next;
  }
  return nodeA;
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