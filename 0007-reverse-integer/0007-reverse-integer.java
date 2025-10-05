class Solution {
    public int reverse(int x) {
        int rev = 0;  // variable to store reversed number

        while (x != 0) {
            int pop = x % 10;  // extract the last digit
            x = x / 10;        // remove the last digit

            // Check for overflow/underflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // underflow
            }

            rev = rev * 10 + pop; // append digit
        }

        return rev;
    }
}
