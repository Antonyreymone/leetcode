class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If array is empty
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for the position of unique elements

        // Start from index 1 and compare with previous element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                i++;               // Move to next position
                nums[i] = nums[j]; // Update unique value
            }
        }

        return i + 1; // Length of unique elements
    }
}
