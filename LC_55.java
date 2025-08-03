
public class LC_55 {
    public boolean canJump1(int[] nums) {
        return jump(0, nums);
    }

    public static boolean jump(int p, int[] up) {//it uses recursion so time was exceeded
        if (p >= up.length - 1) {
            return true;
        }
        if (p+up[p] >= up.length - 1) {
            return true;
        }
        if (up[p] == 0) {
            return false;
        }

        for (int i = 1; i <= up[p]; i++) {
            if (jump(p + i, up)) {
                return true;
            }
        }
        return false;
    }

    static boolean canJump(int[] nums){
        int max = 0;
        int target = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(i>max){
                return false;
            }
            if(i + nums[i] >= max){
                max = i + nums[i];
            }

        }
        if(max >= target){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
