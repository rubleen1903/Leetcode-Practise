public class findtheduplicate {
    class Solution {
        public int findDuplicate(int[] nums) {
             int start = nums[0];
            int end = nums[0];
            do{
                start = nums[start];
                end = nums[nums[end]];
                
            }while(start!=end);
            end = nums[0];
            while(start!=end)
            {
                start = nums[start];
                end = nums[end];
            }
            return start;
        }
    }
}
