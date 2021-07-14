public class medianoftwosorted {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                int N1 = nums1.length, N2 = nums2.length;
            // We want to have smaller array as the second input
            if (N1 < N2) return findMedianSortedArrays(nums2, nums1);
            // The reason is that if we use pointers on the larger array,
            // the index of smaller array might be larger than its length.
            // The indice of smaller array are all potential cut
            int lo = 0, hi = 2 * N2;
            double L1 = Double.NaN, L2 = Double.NaN, R1 = Double.NaN, R2 = Double.NaN;
            while (lo <= hi) {
                int mid2 = lo + (hi - lo) / 2;
                int mid1 = N1 + N2 - mid2;
                L1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[(mid1 - 1)/2];
                L2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[(mid2 - 1)/2];
                R1 = mid1 == 2 * N1 ? Integer.MAX_VALUE : nums1[mid1/2];
                R2 = mid2 == 2 * N2 ? Integer.MAX_VALUE :nums2[mid2/2];
                if (L1 > R2) lo = mid2 + 1;
                else if (L2 > R1) hi = mid2 - 1;
                else break;
            }
            return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
    }
}
