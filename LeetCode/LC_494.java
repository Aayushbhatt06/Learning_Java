class LC_494{
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (Math.abs(target) > totalSum) {
            return 0;
        }

        Integer[][] dp = new Integer[nums.length][2 * totalSum + 1];

        return f(0, 0, nums, target, dp, totalSum);
    }

    public int f(int i, int s, int[] nums, int target, Integer[][] dp, int offset) {

        if (i == nums.length) {
            return s == target ? 1 : 0;
        }

        if (dp[i][s + offset] != null) {
            return dp[i][s + offset];
        }

        int take = f(i + 1, s + nums[i], nums, target, dp, offset);
        int notTake = f(i + 1, s - nums[i], nums, target, dp, offset);

        return dp[i][s + offset] = take + notTake;
    }
}