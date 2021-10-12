/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * self
 */
class Solution {
  public List<Integer> getRow(int rowIndex) {
    int rowNums = rowIndex + 1;
    List<List<Integer>> ans = new ArrayList<>(Collections.nCopies(rowNums, new ArrayList<Integer>()));
    for (int i = 0; i < rowNums; i++) {
      List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 0));
      row.set(0, 1);
      row.set(row.size() - 1, 1);
      ans.set(i, row);
    }
    for (int i = 2; i < rowNums; i++) {
      List<Integer> row = ans.get(i);
      for (int j = 1; j < row.size() - 1; j++) {
        row.set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
      }
    }
    return ans.get(rowIndex);
  }
}