public class ReverseWordsII {

    // Function to reverse each word in a string
    public static String ReverseString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < n) {

            // Skip spaces and add them to result
            while (i < n && s.charAt(i) == ' ') {
                sb.append(' ');
                i++;
            }

            // Start of a word
            int start = i;

            // Go till end of word
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            // Reverse this word
            sb.append(reverseWord(s, start, end));
        }

        return sb.toString();
    }

    // Reverse characters from start to end
    public static String reverseWord(String s, int start, int end) {
        StringBuilder temp = new StringBuilder();

        for (int i = end; i >= start; i--) {
            temp.append(s.charAt(i));
        }

        return temp.toString();
    }

    // Main function
    public static void main(String[] args) {
        String s = "hello world this is java";
        String result = ReverseString(s);

        System.out.println("Original : " + s);
        System.out.println("Reversed : " + result);
    }
}
