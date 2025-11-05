import java.util.*;

public class RemoveOuterMostParenthesis {
    public static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) sb.append('('); // only append if not outermost
                count++;
            } else {
                count--;
                if (count > 0) sb.append(')'); // only append if still inside
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "(()())(())";
        String s2 = "(()())(())(()(()))";
        String s3 = "()()";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + removeOuterParentheses(s1));
        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Output: " + removeOuterParentheses(s2));
        System.out.println();

        System.out.println("Input: " + s3);
        System.out.println("Output: " + removeOuterParentheses(s3));
    }
}
