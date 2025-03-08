public class count {
    public static void main(String[] args) {
        int n = 10015560;
        System.out.println(count(n));
    }

    public static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
