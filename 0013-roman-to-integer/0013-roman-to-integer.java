import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Create a HashMap to store Roman numeral values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));

            // Check the next character
            if (i + 1 < s.length() && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal; // Subtract if next value is greater
            } else {
                result += currentVal; // Otherwise, add
            }
        }

        return result;
    }
}