public class prod1ton {
    static int prod(int n){
        if(n==0){
            return 1;
        }
        return n*prod(n-1);
    }

    public static void main(String[] args) {
        System.out.println(prod(5));
    }
}
