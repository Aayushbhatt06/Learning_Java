public class LC_27 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int check = 0;
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] != val){
                nums[check] = nums[i];
                check++;
            }
        }
        return check;
    }
}
