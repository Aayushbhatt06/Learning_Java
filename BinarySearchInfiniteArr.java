// position of the element in infinite sorted array
// Amazon india interview question 


public class BinarySearchInfiniteArr {

    public static void main(String[] args) {
        int[] arr = {2,15,22,25,43,56,89,100,152,186,200,546,854,1205,1421,1468,1500};
        int ans = search(arr, 100);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int start = 0;
        int end = 2;
        while(true){
            if(nums[end]<target){
                int newstart = end+1;
                end = end + (end-start+1)*2;
                start = newstart;
            }else{
                break;
            }
        }
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;

            }else if(target > nums[mid]){
                start = mid + 1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
