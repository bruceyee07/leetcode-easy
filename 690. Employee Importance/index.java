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
 * https://leetcode.com/problems/employee-importance/solution/
 */
class Solution {
  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee e : employees) {
      map.put(e.id, e);
    }
    return dfs(id, map);
  }
  private int dfs(int id, Map<Integer, Employee> map) {
    Employee e = map.get(id);
    int ans = e.importance;
    for (int sid : e.subordinates) {
      ans += dfs(sid, map);
    }
    return ans;
  }
}