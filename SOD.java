public class SOD {
    public static void main(String[] args) {
        int n = 134256;
        System.out.println(sod(n));
    }

    private static int sod(int n) {
        if(n < 1){
            return 0;
        }

        return (n%10)+sod(n/10);
    }
}
