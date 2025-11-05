public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        // Count for s, subtract for t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // If all frequencies are 0, it's an anagram
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    // Testcase
    public static void main(String[] args) {
        
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("ad", "bc"));           // false
    }
}

