
class LC_53 {

    public static int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int max_curr = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            max_curr = Math.max(nums[i],nums[i]+max_curr);
            max_so_far = Math.max(max_so_far,max_curr);

        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
