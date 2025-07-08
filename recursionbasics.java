public class recursionbasics {
    static int printnum(int n, int rev){
        if(n <1){
            return rev;
        }
        return printnum(n/10, rev*10 + n%10);
    }
    static int reversenum(int n){
        return printnum(n, 0);
    }
    public static void main(String[] args) {
        int n = 28306;
        System.out.println(reversenum(n));
    }
}


