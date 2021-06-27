/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @description https://leetcode.com/problems/intersection-of-two-linked-lists/
 * @tutorial https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
  if (headA === null || headB === null) {
    return null;
  }

  let nodeA = headA;
  let nodeB = headB;

  while (nodeA !== nodeB) {
    nodeA = nodeA ? nodeA.next : headB;
    nodeB = nodeB ? nodeB.next : headA;
  }

  return nodeA;
};


// Visualization of this solution:

// Case 1 (Have Intersection & Same Len):

//        a
// A:     a1 → a2 → a3
//                    ↘
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//        b
//             a
// A:     a1 → a2 → a3
//                    ↘
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//             b
//                  a
// A:     a1 → a2 → a3
//                    ↘
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//                  b
// A:     a1 → a2 → a3
//                    ↘ a
//                      c1 → c2 → c3 → null
//                    ↗ b            
// B:     b1 → b2 → b3

// Since a == b is true, end loop while(a != b), return the intersection node a = c1.


// Case 2 (Have Intersection & Different Len):

//             a
// A:          a1 → a2
//                    ↘
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//        b
//                  a
// A:          a1 → a2
//                    ↘
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//             b
// A:          a1 → a2
//                    ↘ a
//                      c1 → c2 → c3 → null
//                    ↗            
// B:     b1 → b2 → b3
//                  b
// A:          a1 → a2
//                    ↘      a
//                      c1 → c2 → c3 → null
//                    ↗ b           
// B:     b1 → b2 → b3
// A:          a1 → a2
//                    ↘           a
//                      c1 → c2 → c3 → null
//                    ↗      b           
// B:     b1 → b2 → b3
// A:          a1 → a2
//                    ↘                a = null, then a = b1
//                      c1 → c2 → c3 → null
//                    ↗           b           
// B:     b1 → b2 → b3
// A:          a1 → a2
//                    ↘ 
//                      c1 → c2 → c3 → null
//                    ↗                b = null, then b = a1 
// B:     b1 → b2 → b3
//        a
//             b         
// A:          a1 → a2
//                    ↘ 
//                      c1 → c2 → c3 → null
//                    ↗
// B:     b1 → b2 → b3
//             a
//                  b         
// A:          a1 → a2
//                    ↘ 
//                      c1 → c2 → c3 → null
//                    ↗ 
// B:     b1 → b2 → b3
//                  a
// A:          a1 → a2
//                    ↘ b
//                      c1 → c2 → c3 → null
//                    ↗ a
// B:     b1 → b2 → b3

// Since a == b is true, end loop while(a != b), return the intersection node a = c1.


// Case 3 (Have No Intersection & Same Len):

//        a
// A:     a1 → a2 → a3 → null
// B:     b1 → b2 → b3 → null
//        b
//             a
// A:     a1 → a2 → a3 → null
// B:     b1 → b2 → b3 → null
//             b
//                  a
// A:     a1 → a2 → a3 → null
// B:     b1 → b2 → b3 → null
//                  b
//                       a = null
// A:     a1 → a2 → a3 → null
// B:     b1 → b2 → b3 → null
//                       b = null

// Since a == b is true (both refer to null), end loop while(a != b), return a = null.


// Case 4 (Have No Intersection & Different Len):

//        a
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//        b
//             a
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//             b
//                  a
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//                  b
//                       a
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//                       b = null, then b = a1
//        b                   a = null, then a = b1
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//             b                   
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//        a
//                  b
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//             a
//                       b
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//                  a
//                            b = null
// A:     a1 → a2 → a3 → a4 → null
// B:     b1 → b2 → b3 → null
//                       a = null

// Since a == b is true (both refer to null), end loop while(a != b), return a = null.

// Notice that if list A and list B have the same length, this solution will terminate in no more than 1 traversal; if both lists have different lengths, this solution will terminate in no more than 2 traversals -- in the second traversal, swapping a and b synchronizes a and b before the end of the second traversal. By synchronizing a and b I mean both have the same remaining steps in the second traversal so that it's guaranteed for them to reach the first intersection node, or reach null at the same time (technically speaking, in the same iteration) -- see Case 2 (Have Intersection & Different Len) and Case 4 (Have No Intersection & Different Len).

// PS: There are many great explanations of this solution for various cases, I believe to visualize it can resolve most of the doubts posted previously.