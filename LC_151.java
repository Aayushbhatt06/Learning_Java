

public class LC_151 {

    public static String reverseWords(String s) {
        String[] a = s.split(" ");
        String ans = "";
        int n = a.length;
        int e = n-1;
        for(int i = n-1 ; i >= 0 ; i--){
            ans += a[i]+" ";
        }
        return ans.trim();
    }

    public static void main(String[] args) {
        reverseWords("the sky is blue");
    }
}
