public class MaximumDeapth {
    public static int maxDepth(String s) {
        int count = 0;        // current depth
        int maxDepth = 0;     // maximum depth found

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                count++;
                maxDepth = Math.max(maxDepth, count);  // update after '('
            } else if (ch == ')') {
                count--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        String s1 = "(1+(2*3)+((8)/4))+1";
        String s2 = "(1)+((2))+(((3)))";
        String s3 = "1+(2*3)/(2-1)";

        System.out.println("Input: " + s1 + " → Max Depth: " + maxDepth(s1)); // 3
        System.out.println("Input: " + s2 + " → Max Depth: " + maxDepth(s2)); // 3
        System.out.println("Input: " + s3 + " → Max Depth: " + maxDepth(s3)); // 1
    }
}

