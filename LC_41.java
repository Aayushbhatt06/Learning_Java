
import java.util.Arrays;

public class LC_41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        firstMissingPositive(nums);
    }

    static int firstMissingPositive(int[] nums) {

        int i  = 0;
        while (i < nums.length ){
            int correct = nums[i];
            if(correct == i){
                i++;    
            }else if(correct >= nums.length){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }

        }
        System.out.println(Arrays.toString(nums));
        i = 0;
        while(i<nums.length){
            if(nums[i] != i){
                return i;
            }i++;
        }
        return nums.length;
        
    }
}
