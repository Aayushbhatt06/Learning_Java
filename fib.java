class fib{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fib(a));
    }

    public static int fib(int n){
        if(n < 2){
           return n;
        }
        return fib(n-2)+fib(n-1);
    }
}