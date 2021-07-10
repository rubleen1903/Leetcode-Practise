public class findpeak {
    class Solution {
        public int findPeakElement(int[] nums) {
            int left =0;
            int high =nums.length -1;
            while(left<high)
            {
                int mid = left + (high-left)/2;
                if(nums[mid]<nums[mid+1])
                {
                    left = mid+1;
                }
                else{
                    high = mid;
                }
            }
            return left;
        }
    }
}
