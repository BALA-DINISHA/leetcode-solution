class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;

        for (; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                break;
            }
        }

        if (i == word.length()) {
            return word;
        }

        String l = rev(word.substring(0, i + 1));
        return l + word.substring(i + 1);
    }

    public String rev(String k) {
        String r = "";

        for (int i = 0; i < k.length(); i++) {
            r = k.charAt(i) + r;
        }

        return r;
    }
}