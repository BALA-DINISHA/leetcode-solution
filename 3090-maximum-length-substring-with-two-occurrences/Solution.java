class Solution {

    public int maximumLengthSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);
                int k = current(sub);

                if (k > max) {
                    max = k;
                }
            }
        }

        return max;
    }

    int current(String n) {
        int[] freq = new int[26];

        for (int i = 0; i < n.length(); i++) {
            freq[n.charAt(i) - 'a']++;

            if (freq[n.charAt(i) - 'a'] > 2) {
                return 0;
            }
        }

        return n.length();
    }
}