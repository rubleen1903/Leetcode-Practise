// 941. Valid Mountain Array
// Easy
// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

//Solution in java

class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;
        while (i + 1 < n && arr[i] < arr[i+1]) {
            i++;
        }
        
        while (j > 0 && arr[j] < arr[j-1]) {
            j--;
        }
        
        return (i > 0 && i == j && j < n);
    }
}
