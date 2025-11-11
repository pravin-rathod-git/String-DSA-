public class LongestPalindromicString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test cases
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "bb";
        String s4 = "a";
        String s5 = "abbcccbbbcaaccbababcbcabca";

        System.out.println("Input: " + s1 + " → Longest Palindrome: " + sol.longestPalindrome(s1));
        System.out.println("Input: " + s2 + " → Longest Palindrome: " + sol.longestPalindrome(s2));
        System.out.println("Input: " + s3 + " → Longest Palindrome: " + sol.longestPalindrome(s3));
        System.out.println("Input: " + s4 + " → Longest Palindrome: " + sol.longestPalindrome(s4));
        System.out.println("Input: " + s5 + " → Longest Palindrome: " + sol.longestPalindrome(s5));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int n = s.length();
        int start = 0;
        int end = 0;

        // iterate through each character as a center
        for (int i = 0; i < n; i++) {
            int odd = len_palin(s, i, i);       // Odd length palindrome
            int even = len_palin(s, i, i + 1);  // Even length palindrome
            int len = Math.max(odd, even);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // expand around the given center and return palindrome length
    public int len_palin(String s, int l, int r) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1; // actual palindrome length
    }
}
