

public class temp {
    static int sortnegcyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]>0&& nums[i]<=nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else {
                i++;
            }
        }
        // System.out.println(Arrays.toString(nums));
       
        for(i=0;i<nums.length;i++){
            
            if(nums[i] != i+1){
                return i+1;
            }

        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] nums= {100000, 3, 4000, 2, 15, 1, 99999};
        System.out.println(sortnegcyclic(nums));
    }
}
