// leetcode 34
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
import java.util.Arrays;

public class LC_34 {

    public static void main(String[] args) {
        int[] arr = {};
        int[] ans = searchRange(arr, 0);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > nums[nums.length-1]){
                return ans;
            }
            if(target < nums[mid]){
                end = mid - 1;

            }else if(target > nums[mid]){
                start = mid + 1;

            }else if(target == nums[mid]){
                end = mid-1;
                ans[0] = mid;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > nums[nums.length-1]){
                return ans;
            }
            if(target < nums[mid]){
                end = mid - 1;

            }else if(target > nums[mid]){
                start = mid + 1;

            }else if(target == nums[mid]){
                start = mid+1;
                ans[1] = mid;
            }
        }
        return ans;
    }
}
