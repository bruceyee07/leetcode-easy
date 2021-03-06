/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/discuss/917993/Java-Simple-Custom-Sort-with-Detailed-Explanation!
 */
class Solution {
  public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
    return Arrays.stream(nums).boxed()
      .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
      .mapToInt(n -> n)
      .toArray();
  }
}

/**
 * custom sort explanation:
 * .stream(nums)
 * iterates through the nums array

 * .boxed()
 * converts each int to Integer object, this is because .sorted() can only operate on objects

 * .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
 * if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value

 * .mapToInt(n -> n)
 * converts Integer to int

 * .toArray()
 * returns array
 *
 */