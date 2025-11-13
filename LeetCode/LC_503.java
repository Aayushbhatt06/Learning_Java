package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LC_503 {

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack();
        int n;
        n = nums.length;
        int[] ans = new int[nums.length];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i % n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
