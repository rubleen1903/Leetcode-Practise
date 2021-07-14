public class twosum2 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
              int lo = 0, hi = numbers.length - 1;
            int[] indices = new int[2];
            while (lo < hi){
                int sum = numbers[lo] + numbers[hi];
                if (sum < target){
                    lo++;
                } else if (sum > target){
                    hi--;
                } else {
                    indices[0] = lo + 1;
                    indices[1] = hi + 1;
                    break;
                }
            }
            return indices;
        }
    }
}
