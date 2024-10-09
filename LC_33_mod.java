public class LC_33_mod {
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[end]){

                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }else{
                end--;
            }
            //5,1,3
        }
        
        int pivot = start;
        start = 0;
        end = nums.length-1;
        if (target >= nums[pivot] && target <= nums[end]){
            start = pivot;
        }else{
            end = pivot -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;

            }else if(target > nums[mid]){
                start = mid + 1;

            }else if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 2, 2};
        int ans = search(arr, 3);
        System.out.println(ans);
    }
}
