public class Prod {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sod(n));
    }

    private static int sod(int n) {
        if(n%10 == n){
            return n;
        }

        return (n%10)*sod(n/10);
    }
}
