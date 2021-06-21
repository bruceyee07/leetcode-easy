/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @description https://leetcode.com/problems/merge-two-sorted-lists/
 * @type self
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
  var arr1 = linkedListToArray(l1);
  var arr2 = linkedListToArray(l2);
  var arr = merge(arr1, arr2);
  return arrayToLinkedList(arr);
};

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val);
  this.next = (next === undefined ? null : next);
}

function linkedListToArray(list) {
  var arr = [];
  var node = list;
  while (node) {
    arr.push(node.val);
    node = node.next;
  }
  return arr;
}

function merge(arr1, arr2){  
  var result = [];  
  while (arr1.length > 0 && arr2.length > 0) {  
    if (arr1[0] < arr2[0]) {
      result.push(arr1.shift());
    } else {
      result.push(arr2.shift());
    }
  }   
  return result.concat(arr1).concat(arr2);
}

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