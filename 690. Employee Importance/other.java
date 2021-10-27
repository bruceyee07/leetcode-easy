/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/
/**
 * https://leetcode.com/problems/employee-importance/
 * https://leetcode.com/problems/employee-importance/discuss/112587/Java-HashMap-bfs-dfs
 */
class Solution {
  public int getImportance(List<Employee> employees, int id) {
    int ans = 0;
    Map<Integer, Employee> m = new HashMap<>();
    for (Employee e : employees) {
      m.put(e.id, e);
    }
    Queue<Employee> q = new LinkedList<>();
    q.offer(m.get(id));
    while (!q.isEmpty()) {
      Employee employee = q.poll();
      ans += employee.importance;
      for (int sid : employee.subordinates) {
        q.offer(m.get(sid));
      }
    }
    return ans;
  }
}