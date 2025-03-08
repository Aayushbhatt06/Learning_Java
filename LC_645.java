
import java.util.Arrays;


public class LC_645 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;
        // int correct = nums[i] - 1;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]-1 == i){
                i++;
            }else if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
                
            }else{
                i++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        // List<Integer> ans = new ArrayList<>();
        int[] ans = new int[2];
        int a = 0;
        while(a<nums.length){
            if(nums[a] - 1 != a){
                ans[0] = nums[a];
                ans[1] = a+1;
            }
            a++;

        }
        return ans;
        
    }
}
