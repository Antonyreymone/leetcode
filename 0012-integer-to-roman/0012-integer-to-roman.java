class Solution {
    public String intToRoman(int num) {
        // Roman numeral values and symbols in descending order
        int[] values =    {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder roman = new StringBuilder();
        
        // Go through each value starting from the largest
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];             // Subtract the value
                roman.append(symbols[i]);     // Append its Roman symbol
            }
        }
        
        return roman.toString(); // Return final Roman numeral
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 3749;
        System.out.println("Roman numeral: " + sol.intToRoman(num));
    }
}
