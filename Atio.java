public class Atio {
    public static int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        long num = 0;

        // 1️⃣ Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2️⃣ Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3️⃣ Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // 4️⃣ Check for overflow
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        // 5️⃣ Return final value
        return (int)(num * sign);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));               // 42
        System.out.println(myAtoi("   -42"));           // -42
        System.out.println(myAtoi("4193 with words"));  // 4193
        System.out.println(myAtoi("words and 987"));    // 0
        System.out.println(myAtoi("-91283472332"));     // -2147483648 (clamped)
    }
}
