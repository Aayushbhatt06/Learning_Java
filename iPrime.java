import java.util.Arrays;

class iPrime {
    public static void main(String[] args) {
        System.out.println("Is 5 prime? " + isPrime(5));
        System.out.println(Arrays.toString(prime(5)));
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] prime(int n) {
        int count = 0;
        int a = 2;
        int[] primes = new int[n];
        while (count < n) {
            if (isPrime(a)) {
                primes[count] = a;
                count++;
            }
            a++;
        }
        return primes;
    }
}
