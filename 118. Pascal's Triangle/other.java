/**
 * https://leetcode.com/problems/pascals-triangle/
 * https://leetcode.com/problems/pascals-triangle/discuss/38141/My-concise-solution-in-Java
 */
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> allrows = new ArrayList<>();
    List<Integer> row = new ArrayList<Integer>();
    for (int i = 0; i < numRows; i++) {
      row.add(0, 1);
      for (int j = 1; j < row.size() - 1; j++)
        row.set(j, row.get(j) + row.get(j + 1));
      // 这块要特别注意是不能直接使用 allrows.add(row); 而要使用 new ArrayList<Integer>(row); 为什么？
      // 因为 new ArrayList<Integer>(row) 是创建的一份 row 的拷贝，这样在循环继续往下进行时，row 在改变，不至于
      // 使 allrows 也发生改变。否则的话，在循环结束时，allrows 的每一行都是一样的，都是相同的 row，因为是同一份引用
      // 具体可以看下 demo1 和 demo2 运行结果的差异
      allrows.add(new ArrayList<Integer>(row));
    }
    return allrows;
  }
}