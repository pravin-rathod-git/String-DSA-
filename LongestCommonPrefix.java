public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take the first word as a starting point
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with prefix,
            String s = strs[i];
            int j = 0;

            // Compare characters until mismatch
            while (j < s.length() && j < prefix.length()
                    && s.charAt(j) == prefix.charAt(j)) {
                j++;
            }

            // If no char matched → no prefix
            if (j == 0) {
                return "";
            }

            // Shrink prefix
            prefix = prefix.substring(0, j);
        }

        return prefix;
    }

    // Testcase
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interspecies", "interstellar", "interstate"};
        String[] strs4 = {"apple", "ape", "april"};

        System.out.println(longestCommonPrefix(strs1)); // Output: fl
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
        System.out.println(longestCommonPrefix(strs3)); // Output: inters
        System.out.println(longestCommonPrefix(strs4)); // Output: ap
    }
}
