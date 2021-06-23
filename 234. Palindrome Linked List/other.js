/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @tutorial  https://leetcode.com/problems/palindrome-linked-list/discuss/181453/Java-or-5-lines-method-or-2ms-or-O(n)-or-recursive-or-easy-to-understand
 * Explanation
 * ..........................................................................................
 * Example :
 * 1-> 2-> 3-> 4-> 2-> 1
 * ref points 1 initially.
 * Make recursive calls until you reach the last element - 1.
 * On returning from each recurssion, check if it is equal to ref values. 
 * ref values are updated to on each recurssion.
 * So first check is ref 1 -  end 1
 * Second ref 2 - second last 2 ...and so on.
 * ..........................................................................................
 *
 */

/**
 * @description https://leetcode.com/problems/palindrome-linked-list/
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
  var ref = head;
  
  function check(node){
    if(node == null) return true;
    var ans = check(node.next);
    var isEqual = (ref.val == node.val) ? true : false; 
    ref = ref.next;
    return ans && isEqual;
  }
  
  return check(head);
};