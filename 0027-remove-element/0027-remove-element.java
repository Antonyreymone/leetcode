class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to store position of next valid element

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
         return k; // Return the new length
    }
}

   