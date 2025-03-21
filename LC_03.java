
import java.util.Arrays;


public class LC_03 {
    public static int lengthOfLongestSubstring(String s) {
        int[] arr = new int[s.length()];
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char[] chars = new char[s.length()];
            boolean flag = false;
            for(int j = i+1 ; j < s.length() ; j++){
                for(int a = 0 ; a < chars.length ; a++){
                    if(chars[a] == s.charAt(j)){
                        flag = true;
                    }
                }
                if(s.charAt(i) == s.charAt(j)){
                    break;
                }
                if(flag){
                    break;
                }
                else{
                    chars[j] = s.charAt(j);
                    arr[i] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int max = 1;
        for(int i = 0; i < s.length() ; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max+1;


    }

    public static void main(String[] args) {
        String s  = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
