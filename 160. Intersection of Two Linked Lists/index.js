/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/intersection-of-two-linked-lists/
 * @type self
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
  if (headA === null || headB === null) {
    return null;
  }

  const sizeA = getNodeSize(headA);
  const sizeB = getNodeSize(headB);
  let nodeA = headA;
  let nodeB = headB;

  if (sizeA === sizeB) {
    return getIntersectionNodeWhenEqual(nodeA, nodeB);
  } else if (sizeA > sizeB) {
    let depth = sizeA - sizeB;
    while (depth > 0) {
      nodeA = nodeA.next;
      depth--;
    }
    return getIntersectionNodeWhenEqual(nodeA, nodeB);
  } else {
    let depth = sizeB - sizeA;
    while (depth > 0) {
      nodeB = nodeB.next;
      depth--;
    }
    return getIntersectionNodeWhenEqual(nodeA, nodeB);
  }
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

function getIntersectionNodeWhenEqual (nodeA, nodeB) {
  while (nodeA) {
    if (nodeA === nodeB) {
      return nodeA;
    } else {
      nodeA = nodeA.next;
      nodeB = nodeB.next;
    }
  }
  return null;
}