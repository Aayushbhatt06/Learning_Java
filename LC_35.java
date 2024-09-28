public class LC_35 {
    static int searchInsert(vector<int>& nums, int target) {
        int len = nums.size();
        for(int i = 0 ; i < len ; i++){
            if(nums[i] >= target){
                return i;
            }
        }return len;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums , 7));
    }
}
