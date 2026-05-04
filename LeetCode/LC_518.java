package LeetCode;

class LC_518 {

    Integer[][] dp;

    public int change(int amount, int[] coins) {

        this.dp = new Integer[coins.length][amount + 1];
        return f(0, 0, coins, amount);
    }

    public int f(int i, int s, int[] coins, int amount) {
        if (s > amount) {
            return 0;
        }
        if (i >= coins.length) {
            return s == amount ? 1 : 0;
        }
        if (dp[i][s] != null) {
            return dp[i][s];
        }
        int take = f(i, s + coins[i], coins, amount);
        int notTake = f(i + 1, s, coins, amount);
        return dp[i][s] = take + notTake;
    }
}
