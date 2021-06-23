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
  var prev = null;
  var cur = head;
  while (cur !== null) {
    var next = cur.next;
    cur.next = prev;
    prev = cur;
    cur = next;
  }
  return prev;
};

class Node {
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
  }
}

class SinglyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  
  offer(data) {
    const node = new Node(data);

    if (this.size === 0) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
    this.size++;

    return this;
  }

  add(node) {
    if (this.size === 0) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
    this.size++;
    
    return this;
  }
}

var tail = null;
var node5 = new Node(5, tail);
var node4 = new Node(4, node5);
var node3 = new Node(3, node4);
var node2 = new Node(2, node3);
var node1 = new Node(1, node2);

var ll = new SinglyLinkedList();
ll.add(node1);
ll.add(node2);
ll.add(node3);
ll.add(node4);
ll.add(node5);

reverseList(node1);