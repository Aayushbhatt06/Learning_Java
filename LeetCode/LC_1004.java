package LeetCode;
class LC_1004{
    public static int longestOnes(int[] nums, int k) {
        int c= 0;
        int mc = 0;
        int t = k;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                if(nums[j] == 1){
                    c++;
                }else if(nums[j] == 0 && t > 0){
                    c++;
                    t--;
                }else{
                    break;
                }
            }
            if(c > mc){
                mc = c;
            }
            c = 0;
            t = k;
        }
        return mc;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(a, 2));
    }
}