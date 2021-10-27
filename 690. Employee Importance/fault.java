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
 * self
 */
class Solution {
  public int getImportance(List<Employee> employees, int id) {
    Employee target = employees
      .stream()
      .filter(employee -> employee.id == id)
      .findAny()
      .orElse(null);
    List<Integer> subordinates = target.subordinates;
    List<Integer> importanceOfSubordinates = new ArrayList<>();
    for (int sid : subordinates) {
      Employee subordinate = (employees
        .stream()
        .filter(employee -> employee.id == sid)
        .findAny().orElse(null));
      importanceOfSubordinates.add(subordinate.importance);
      for (int subid : subordinate.subordinates) {
        Employee subsubordinate = (employees
          .stream()
          .filter(employee -> employee.id == subid)
          .findAny().orElse(null));
        importanceOfSubordinates.add(subsubordinate.importance);
      }
    }
    int sumOfSubordinates = importanceOfSubordinates
      .stream()
      .mapToInt(x -> x)
      .sum();
    return target.importance + sumOfSubordinates;
  }
}