
public class LC_153 {

    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (s == e) {
                if (nums[m] < min) {
                    min = nums[m];
                }
                return min;
            }
            if (nums[m] < nums[e]) {
                e = m;
            } else if (nums[m] > nums[e]) {
                s = m + 1;
            }
            if (nums[m] < min) {
                min = nums[m];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(findMin(a));
    }
}
