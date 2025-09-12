
class LC_540 {

    public static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int len = nums.length;
        int e = len - 1;
        if (nums.length == 1) {
            return nums[0];
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid == 0) {
                if (nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                }
            } else if (mid == len - 1) {
                if (nums[mid] != nums[mid - 1]) {
                    return nums[mid];
                }
            } else if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else {
                if (isEven(mid)) {
                    if (nums[mid] == nums[mid + 1]) {
                        s = mid + 2;
                    } else {
                        e = mid - 1;
                    }
                } else {
                    if (nums[mid] == nums[mid - 1]) {
                        s = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }
}
