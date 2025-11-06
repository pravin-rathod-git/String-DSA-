public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Step 1: Define values and symbols in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Step 2: Build result
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int n3 = 9;
        int n4 = 58;
        int n5 = 1994;

        System.out.println(n1 + " → " + intToRoman(n1));    // III
        System.out.println(n2 + " → " + intToRoman(n2));    // IV
        System.out.println(n3 + " → " + intToRoman(n3));    // IX
        System.out.println(n4 + " → " + intToRoman(n4));    // LVIII
        System.out.println(n5 + " → " + intToRoman(n5));    // MCMXCIV
    }
}
