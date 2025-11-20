public class StringZigzag {

    // Function to convert string into ZigZag pattern
    public String convert(String s, int numRows) {

        int n = s.length();

        // If number of rows is 1 → return string as it is
        if (numRows == 1) return s;

        // Create an array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        boolean down = false; // Direction flag (false = up, true = down)
        int row = 0;

        // Traverse each character in the string
        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);
            rows[row].append(c); // Add character to the correct row

            // Change direction at boundaries
            if (row == 0) {
                down = true;        // Start going DOWN
            } else if (row == numRows - 1) {
                down = false;       // Start going UP
            }

            // Move to next row depending on direction
            row += (down ? 1 : -1);
        }

        // Combine all rows
        StringBuilder sb = new StringBuilder();
        for (StringBuilder r : rows) {
            sb.append(r);
        }

        return sb.toString();
    }

    // Main function to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "PAYPALISHIRING";

        System.out.println("Input: " + s);
        System.out.println("Rows = 3 → " + sol.convert(s, 3));
        System.out.println("Rows = 4 → " + sol.convert(s, 4));
    }
}
