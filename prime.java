public class prime {
    static Boolean isPrime(int a){
        boolean isprime = true;
        for(int i = 2 ; i<a/2 ; i++){
            if(a % i == 0){
                isprime = false;
                return isprime;
            }
            
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5471));
    }
}
