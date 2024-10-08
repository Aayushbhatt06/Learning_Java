//https://leetcode.com/problems/peak-index-in-a-mountain-array
public class LC_852 {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){

                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }else{
                return mid;
            }
        } 
        return end;
    }
}
