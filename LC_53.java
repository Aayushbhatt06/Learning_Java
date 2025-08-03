class LC_53 {

    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum > max_so_far) {
                max_so_far = sum;
                start = tempStart;
                end = i;
            }

            if(sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        // Print the subarray
        System.out.print("Subarray with max sum: ");
        for(int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return max_so_far;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums));
    }
}
