public class no_of_zeroes {
    static int counter(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    public static void main(String[] args) {
        System.out.println(counter(20400));
    }
}
