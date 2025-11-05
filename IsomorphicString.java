import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        // If lengths differ, they can't be isomorphic
        if (s.length() != t.length()) return false;

        // Two maps to maintain both directions of mapping
        HashMap<Character, Character> t1 = new HashMap<>();
        HashMap<Character, Character> t2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);

            // If s1 was already mapped, it must map to s2
            if (t1.containsKey(s1) && t1.get(s1) != s2) return false;

            // If s2 was already mapped, it must map to s1
            if (t2.containsKey(s2) && t2.get(s2) != s1) return false;

            // Otherwise, record the mapping in both directions
            t1.put(s1, s2);
            t2.put(s2, s1);
        }

        return true;
    }

    // 🧪 Testcase
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isIsomorphic("egg", "add"));    // true
        System.out.println(sol.isIsomorphic("foo", "bar"));    // false
        System.out.println(sol.isIsomorphic("paper", "title"));// true
        System.out.println(sol.isIsomorphic("ab", "aa"));      // false
    }
}
