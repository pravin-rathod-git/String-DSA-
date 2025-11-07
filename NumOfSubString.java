public class NumOfSubString {
    public static int CountSubstring(String s) {
        int n = s.length();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // If we encounter a non-space and we're not already in a word
            if (c != ' ' && !inWord) {
                inWord = true;
                count++; // new word starts
            } 
            // If we encounter a space, mark end of word
            else if (c == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "  Hello my   name is pravin ";
        System.out.println(CountSubstring(s)); // Output: 5
    }
}
