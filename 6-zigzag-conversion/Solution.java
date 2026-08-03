class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        StringBuilder[] row = new StringBuilder[numRows];
        int currentRow = 0;
        int direction = 1;

        for (int i = 0; i < numRows; i++) {
            row[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row[currentRow].append(c);

            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            res.append(row[i]);
        }

        return res.toString();
    }
}