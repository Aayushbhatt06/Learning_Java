// https://leetcode.com/problems/search-in-rotated-sorted-array

public class LC_33 {
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[end]){

                start = mid + 1;
            }else{
                end = mid;
            }
            //5,1,3
        }
        int pivot = start - 1;
        start = 0;
        end = pivot;
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
        start = pivot + 1;
        end = nums.length-1;
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
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr, 0);
        System.out.println(ans);
    }
}
