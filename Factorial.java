public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));
            }
        
            private static int fact(int n) {
                if(n == 0){
                    return 1;
                }
                else if(n == 1){
                    return 1;
                }
                return n * fact(n-1);
            }
}
