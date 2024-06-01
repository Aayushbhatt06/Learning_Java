package Java_codes;
public class timeprime {
    public static void main(String[] args) {
        int n = 40;
        Boolean[] primes = new Boolean[n+1];
        for (int i = 0; i <= n; i++) {
            primes[i] = false; // Initializing primes array
        }
        isPrime(n, primes);
    }

    private static void isPrime(int n, Boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    if (!primes[j]) {
                        primes[j] = true;
                    }
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
