// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class LC_1295 {
    static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int c = 0;
            int n = nums[i];
            while(n >0){
                n = n/10;
                c = c+1;
            }
            if(c%2==0){
                ans = ans+1;
            }
            
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
