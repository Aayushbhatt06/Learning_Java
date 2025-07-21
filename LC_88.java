
import java.util.Arrays;


public class LC_88 {

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 7, 0, 0, 0};
        int[] nums2 = {1, 5, 9};
        merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int p = 0;
        int[] sorted = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                sorted[p++] = nums1[i++];
            } else {
                sorted[p++] = nums2[j++];
            }
        }

        while (i < m) {
            sorted[p++] = nums1[i++];
        }

        while (j < n) {
            sorted[p++] = nums2[j++];
        }

        for (int a = 0; a < m + n; a++) {
            nums1[a] = sorted[a];
        }
    }
}
