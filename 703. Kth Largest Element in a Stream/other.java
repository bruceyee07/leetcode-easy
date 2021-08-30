/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/discuss/149050/Java-Priority-Queue
 */
class KthLargest {
  final int k;
  final PriorityQueue<Integer> q;
  
  public KthLargest(int k, int[] a) {
    this.k = k;
    q = new PriorityQueue<Integer>(k);
    for (int n : a)
      add(n); 
  }

  public int add(int n) {
    if (q.size() < k) {
      q.offer(n);
    } else if (q.peek() < n) {
      q.poll();
      q.offer(n);
    }
    return q.peek();
  }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */