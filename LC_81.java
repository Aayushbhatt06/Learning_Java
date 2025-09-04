
public class LC_81 {

    public static boolean search(int[] nums, int target) {
        int p = 0;
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] < nums[e]) {
                e = m;
            } else if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e--;
            }
        }
        p = s;
        s = 0;
        e = nums.length - 1;

        if (nums[s] <= target && nums[p - 1] >= target) {
            e = p - 1;
            while (s < e) {
                int m = s + (e - s) / 2;
                if (nums[m] == target) {
                    return true;
                } else if (nums[m] < target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
            return false;
        } else {
            s = p;
            e = nums.length - 1;
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (nums[m] == target) {
                    return true;
                } else if (nums[m] < target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 1};
        System.out.println(search(a, 0));
    }
}
