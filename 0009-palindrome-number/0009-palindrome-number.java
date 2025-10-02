class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            x = x / 10;                   // Remove last digit
        }

        // Check if original number equals reversed number
        return original == reversed;
    }
}

   