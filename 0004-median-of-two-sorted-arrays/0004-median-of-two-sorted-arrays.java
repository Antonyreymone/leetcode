public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // ✅ Your logic goes here
        // For now, this is just a simple example
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // merge two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        // find median
        int total = m + n;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total/2-1] + merged[total/2])/2.0;
        }
    }
}




 