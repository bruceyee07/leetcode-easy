 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * https://leetcode.com/problems/palindrome-linked-list/discuss/181453/Java-or-5-lines-method-or-2ms-or-O(n)-or-recursive-or-easy-to-understand
 * 
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
class Solution {
  ListNode ref;
  public boolean isPalindrome(ListNode head) {
    ref = head;        
    return check(head);
  }
  
  public boolean check(ListNode node){
    if(node == null) return true;
    boolean ans = check(node.next);
    boolean isEqual = (ref.val == node.val)? true : false; 
    ref = ref.next;
    return ans && isEqual;
  }
}