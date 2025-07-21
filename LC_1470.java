
import java.util.Arrays;

public class LC_1470 {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(a,3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int j = n;
        int[] arr = new int[n * 2];
        int x = 0;  // added to track x elements
        for(int i = 0 ; i < 2 * n; i++){
            if(i % 2 == 0){
                arr[i] = nums[x];  // fetch from first half
                x++;
            } else {
                arr[i] = nums[j];  // fetch from second half
                j++;
            }
        }

        return arr;
    }
}
