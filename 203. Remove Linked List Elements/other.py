# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# description https://leetcode.com/problems/remove-linked-list-elements/
# tutorial https://leetcode.com/problems/remove-linked-list-elements/discuss/158651/Simple-Python-solution-with-explanation-(single-pointer-dummy-head).
class Solution:
  def removeElements(self, head: ListNode, val: int):
    """
    :type head: ListNode
    :type val: int
    :rtype: ListNode
    """

    dummy_head = ListNode(-1)
    dummy_head.next = head

    current_node = dummy_head
    while current_node.next != None:
      if current_node.next.val == val:
        current_node.next = current_node.next.next
      else:
        current_node = current_node.next
    return dummy_head.next