
public class Rod_Cutting {

    Integer[][] dp;

    public int cutRod(int[] price) {
        // code here
        this.dp = new Integer[price.length + 1][price.length + 1];
        return f(0, 0, price, price.length);
    }

    public int f(int i, int t, int[] price, int c) {
        if (i >= price.length) {
            return 0;
        }
        if (dp[i][t] != null) {
            return dp[i][t];
        }
        int nt = f(i + 1, t, price, c);
        int take = 0;
        if (i + 1 <= (c - t)) {
            take = price[i] + f(i, t + (i + 1), price, c);
        }

        return dp[i][t] = Math.max(nt, take);
    }
}
