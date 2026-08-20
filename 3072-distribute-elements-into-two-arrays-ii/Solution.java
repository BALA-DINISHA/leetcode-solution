class Solution {
    public int[] resultArray(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int[] arr1 = new int[l];
        int[] arr2 = new int[l];

        int a = 0;
        int b = 0;

        arr1[a++] = nums[0];
        arr2[b++] = nums[1];

        for (int i = 2; i < l; i++) {
            if (arr1[a - 1] > arr2[b - 1]) {
                arr1[a++] = nums[i];
            } else {
                arr2[b++] = nums[i];
            }
        }

        int k = 0;

        for (int i = 0; i < a; i++) {
            res[k++] = arr1[i];
        }

        for (int i = 0; i < b; i++) {
            res[k++] = arr2[i];
        }

        return res;
    }
}