public public class ReverseWords {

    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break; // No more words

            int j = i;
            // Move i to the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append the current word
            sb.append(s.substring(i + 1, j + 1));

            // Skip spaces before the next word
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If more words remain, add a single space
            if (i >= 0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "  the sky  is  blue ";
        String s2 = "hello world";
        String s3 = "a good   example";
        String s4 = "   one   ";

        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: \"" + reverseWords(s1) + "\"\n");

        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: \"" + reverseWords(s2) + "\"\n");

        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: \"" + reverseWords(s3) + "\"\n");

        System.out.println("Input: \"" + s4 + "\"");
        System.out.println("Output: \"" + reverseWords(s4) + "\"");
    }
}
 
