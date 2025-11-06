import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        // Step 1: Create a mapping of Roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        // Step 2: Traverse string
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // If this value is less than next value → subtract
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String s1 = "III";     // 3
        String s2 = "IV";      // 4
        String s3 = "IX";      // 9
        String s4 = "LVIII";   // 58
        String s5 = "MCMXCIV"; // 1994

        System.out.println(s1 + " → " + romanToInt(s1));
        System.out.println(s2 + " → " + romanToInt(s2));
        System.out.println(s3 + " → " + romanToInt(s3));
        System.out.println(s4 + " → " + romanToInt(s4));
        System.out.println(s5 + " → " + romanToInt(s5));
    }
}
