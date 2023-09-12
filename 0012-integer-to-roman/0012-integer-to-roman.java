class Solution {
    public String intToRoman(int num) {
      // Define two arrays to hold Roman numeral symbols and their corresponding values.
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Iterate through the values and symbols arrays.
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                // Subtract the value from num and append the corresponding symbol.
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }
}