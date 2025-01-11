
public class LC_287 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDisappearedNumbers(nums));
    }

    static int findDisappearedNumbers(int[] nums) {
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

        int a = 0;
        while(a<nums.length){
            if(nums[a] - 1 != a){
                return nums[a];
            }
            a++;

        }
        return -1;
        
        
    }

}
