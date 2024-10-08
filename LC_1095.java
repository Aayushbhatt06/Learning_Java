//leetcode 1095
// https://leetcode.com/problems/find-in-mountain-array
public class LC_1095 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int ans = findInMountainArray(3, arr);
        System.out.println(ans);
    }

    static int findInMountainArray(int target, int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int peak = 0;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){

                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }else{
                peak = mid;
            }
        } 
        peak = end;
        start = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;

            }else if(target > arr[mid]){
                start = mid + 1;

            }else if(target == arr[mid]){
                return mid;
            }
        }
        start = peak + 1;
        end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[arr.length-1]){
                return -1;
            }
            if(target > arr[mid]){
                end = mid - 1;

            }else if(target < arr[mid]){
                start = mid + 1;

            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;

    }
}
