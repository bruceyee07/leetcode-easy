/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * self
 */
class Solution {
  public List<Integer> preorder(Node root) {
    List<Integer>list = new ArrayList<>();
    if (root == null) return list;
    if (root.children.size() == 0) {
      list.add(root.val);
      return list;
    }
    list.add(root.val);
    for (Node node : root.children) {
      list.addAll(preorder(node));
    }
    return list;
  }
}