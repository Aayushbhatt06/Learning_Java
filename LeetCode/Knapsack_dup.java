class Knapsack_dup{
    Integer[][] dp;

    public int knapSack(int val[], int wt[], int capacity) {

        dp = new Integer[wt.length][capacity + 1];

        return f(0, 0, val, wt, capacity);
    }

    public int f(int i, int c, int val[], int wt[], int capacity){

        if(i >= wt.length){
            return 0;
        }

        if(dp[i][c] != null){
            return dp[i][c];
        }

        int take = 0;

        // take same item again
        if(c + wt[i] <= capacity){
            take = val[i] + f(i, c + wt[i], val, wt, capacity);
        }

        // move to next item
        int nt = f(i + 1, c, val, wt, capacity);

        return dp[i][c] = Math.max(take, nt);
    }
}