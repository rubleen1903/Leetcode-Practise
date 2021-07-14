public class finkthsmallestpair {
    class Solution {
        public int smallestDistancePair(int[] nums, int k) {
            Arrays.sort(nums);
            int lo = 0, hi = nums[nums.length - 1] - nums[0];
            while (lo != hi) {
                int mi = lo + (hi - lo) / 2;
                if (count(nums, mi) < k) lo = mi + 1;
                else hi = mi;
            }
            return lo;
        }
       private int count(int[] nums, int d) {
            int right = 1;
            int count = 0;
            while (right < nums.length) {
                int left = 0;
                while (nums[right] - nums[left] > d) left++;
                count += right - left;
                right++;
            }
            return count;
        }
    }
}
