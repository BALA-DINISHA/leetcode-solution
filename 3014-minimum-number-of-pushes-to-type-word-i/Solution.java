class Solution {
    public int minimumPushes(String word) {
        int push;
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            push = (i / 8) + 1;
            sum += push;
        }

        return sum;
    }
}