import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        
        // Copy elements from nums1 to merged
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        
        // Copy elements from nums2 to merged
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        
        // Sort the merged array
        Arrays.sort(merged);
        
        // Calculate and return the median
        return calculateMedian(merged);
    }
    
    // Method to calculate the median of a sorted array
    public double calculateMedian(int[] sortedArray) {
        int total = sortedArray.length;
        
        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) sortedArray[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = sortedArray[total / 2 - 1];
            int middle2 = sortedArray[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}