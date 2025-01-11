
import java.util.ArrayList;
import java.util.List;

public class LC_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();
        int a = 0;
        while(a < nums.length){
            if(nums[a]-1 != a){
                ans.add(a+1) ;
            }
            a++;
        }return ans;
        
    }
}


