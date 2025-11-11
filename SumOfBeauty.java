public class SumOfBeauty {

    public static int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        // Fix the starting point of substring
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // frequency of each letter

            // Extend substring to the right
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // find max and min frequencies for current substring
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }

    public static void main(String[] args) {
     
        String s = "aabcb";
        System.out.println(beautySum(s)); // Output: 5
    }

}
