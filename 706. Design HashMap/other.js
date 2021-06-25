/**
 * @description https://leetcode.com/problems/design-hashmap/
 * @tutorial https://leetcode.com/problems/design-hashmap/discuss/1097755/JS-Python-Java-C%2B%2B-or-(Updated)-Hash-and-Array-Solutions-w-Explanation
 */
class ListNode {
  constructor(key, val, next) {
    this.key = key;
    this.val = val;
    this.next = next;
  }
}
class MyHashMap {
  /**
   * Initialize your data structure here.
   */
  constructor() {
    this.size = 19997;
    this.mult = 12582917;
    this.data = new Array(this.size);
  }
  hash(key) {
    return (key * this.mult) % this.size;
  }
  /**
   * value will always be non-negative. 
   * @param {number} key 
   * @param {number} value
   * @return {void}
   */
  put(key, val) {
    this.remove(key);
    let h = this.hash(key);
    let node = new ListNode(key, val, this.data[h]);
    this.data[h] = node;
  }
  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key 
   * @param {number} key
   * @return {number}
   */
  get(key) {
    let h = this.hash(key),
      node = this.data[h];
    for (; node; node = node.next) if (node.key === key) return node.val;
    return -1;
  }
  /**
   * Removes the mapping of the specified value key if this map contains a mapping for the key 
   * @param {number} key
   * @return {void}
   */
  remove(key) {
    let h = this.hash(key),
      node = this.data[h];
    if (!node) return;
    if (node.key === key) this.data[h] = node.next;
    else
      for (; node.next; node = node.next)
        if (node.next.key === key) {
          node.next = node.next.next;
          return;
        }
  }
}
