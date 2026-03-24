
import java.util.Arrays;

class LC01 {

    public static int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);
        while (l < r) {
            int sum = nums[r] + nums[l];
            if (sum == target) {
                return new int[]{l, r};
            }
            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }
}
