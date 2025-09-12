
import java.util.Arrays;
import java.util.Stack;

public class nge {

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 1, 6, 4, 8, 4, 1, 1, 2, 5, 5, 4, 9, 5};
        System.out.println(Arrays.toString(nextGreaterElement(a)));
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (arr[i] < st.peek()) {
                ans[i] = st.peek();
            } 
            st.push(arr[i]);
        }
        return ans;
    }
}
