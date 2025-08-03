
import java.util.Arrays;

public class LC_75 {

    public static void sortColors(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] != 0) {
                if (nums[j] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        i = 0;
        j = nums.length - 1;

        while (i < j) {
            if (nums[j] == 2) {
                j--;
                continue;
            }
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 2, 0, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
