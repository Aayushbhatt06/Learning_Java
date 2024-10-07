public class BinarySearch_Floor {
    public static void main(String[] args) {
        int[] arr = {2,15,22,25,43,56,89,100,152,186};
        int ans = floor(arr, 125);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int start = 1;
        int end = arr.length-1;
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
        return end;
    }
}
