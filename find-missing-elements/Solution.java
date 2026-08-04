class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> a = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        for (int i = min; i <= max; i++) {
            boolean flag = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                a.add(i);
            }
        }

        return a;
    }
}