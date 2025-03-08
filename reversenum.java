public class reversenum {
    public static void main(String[] args) {
        int n = 1824;
        System.out.println(rev(n));
    }

    public static int  rev(int n){
        if(n==0){
            return 0;
        }

        
        int digits = (int) (Math.log10(n)) + 1;
        digits--;
        return (int) ((n/Math.pow(10, digits)) + rev((int) (n%Math.pow(10, digits)))*10);
    }
}
