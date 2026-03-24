import java.util.Arrays;

public class AggressiveCows {
    
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int l = 1;
        int r = stalls[stalls.length-1]-stalls[0];
        while(l <= r){
            int m = l + (r - l) / 2;
            if(isValid(stalls,k,m)){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return r;
    }
    
    public static boolean isValid(int[] stalls, int k, int m){
        int t = 1;
        int i = 0;
        for(int j = 1 ; j < stalls.length ; j++){
            int d = stalls[j] - stalls[i];
            if(d >= m){
                t++;
                i = j;
            }
        }
        return t >= k;
    }
    
    public static void main(String[] args) {
        int[] stalls = {1,5,2,6,8,10};
        System.out.println(aggressiveCows(stalls, 3));  
    }
}