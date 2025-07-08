
class LC_2016 {
    public static int maximumDifference(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        int greatest = Integer.MIN_VALUE;
        for(i = 0; i < j; i ++){
            for (j = i+1; j < n; j++) {
                if(nums[i] < nums[j]){
                    if((nums[j] - nums[i])>greatest){
                        greatest = nums[j] - nums[i];
                    }
                }
            }
        }
        if(greatest == Integer.MIN_VALUE){
            return -1;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
}