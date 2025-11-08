public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int ch = num.charAt(i) - '0';
            if (ch % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num1 = "52";
        String num2 = "4206";
        String num3 = "35427";
    

        System.out.println("Input: " + num1 + " -> Output: " + largestOddNumber(num1));
        System.out.println("Input: " + num2 + " -> Output: " + largestOddNumber(num2));
        System.out.println("Input: " + num3 + " -> Output: " + largestOddNumber(num3));
       
    }
}

