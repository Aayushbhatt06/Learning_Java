// Leet code 162
// https://leetcode.com/problems/find-peak-element
public class LC_162 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){

                end = mid;
            }else if(nums[mid]<nums[mid+1]){
                start = mid + 1;
            }else{
                return mid;
            }
        } 
        return end;
    }
}
