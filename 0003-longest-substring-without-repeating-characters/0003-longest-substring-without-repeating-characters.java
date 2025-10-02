import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Use a HashSet to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;   // Left pointer of the sliding window
        int maxLength = 0;

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If duplicate is found, shrink window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character
            set.add(s.charAt(right));

            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

