
import java.util.Arrays;

public class LC_322 {

    // 1. Recursive solution 
    int min = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int ans = f(0, 0, 0, coins, amount);
        return ans > amount ? -1 : ans;
    }

    public int f(int i, int c, int t, int[] nums, int amount) {
        if (c == amount) {
            return t;
        }
        if (i >= nums.length || c >= amount) {
            if (c == amount) {
                return t;
            } else {
                return -1;
            }
        }

        int tn = f(i + 1, c + nums[i], t + 1, nums, amount);
        int ts = f(i, c + nums[i], t + 1, nums, amount);
        int sn = f(i + 1, c, t, nums, amount);

        int a = tn >= 0 ? tn : Integer.MAX_VALUE;
        int b = ts >= 0 ? ts : Integer.MAX_VALUE;
        int d = sn >= 0 ? sn : Integer.MAX_VALUE;

        return min = Math.min(a, Math.min(b, d));
    }

    // DP solution
    public int coinChange_DP(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = f(0, amount, coins, dp);

        return ans >= (int) 1e9 ? -1 : ans;
    }

    public int f(int i, int amount, int[] coins, int[][] dp) {
        if (amount == 0) {
            return 0;
        }

        if (i >= coins.length) {
            return (int) 1e9;
        }

        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int take = (int) 1e9;
        if (coins[i] <= amount) {
            take = 1 + f(i, amount - coins[i], coins, dp);
        }

        int notTake = f(i + 1, amount, coins, dp);

        return dp[i][amount] = Math.min(take, notTake);
    }
}
