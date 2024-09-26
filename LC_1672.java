public class LC_1672 {
    static int maximumWealth(int[][] accounts) {
        int n_customers = accounts.length;
        int max_w = Integer.MIN_VALUE;
        int wealth = 0;
        for(int i = 0 ; i < n_customers ; i++){
            for(int j = 0 ; j < accounts[i].length ; j++){
                wealth = wealth + accounts[i][j];
            }
            if(max_w < wealth){
                max_w = wealth;
            }
            wealth = 0;
        }
        return max_w;

    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
