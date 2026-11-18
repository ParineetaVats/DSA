class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int dc = 0;

            while (num > 0) {
                num = num / 10;
                dc++;
            }

            if (dc % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}