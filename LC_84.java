
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class LC_84 {

    // public static int largestRectangleArea(int[] heights) {
    //     int maxh = 0;
    //     for (int i = 0; i < heights.length; i++) {
    //         if (heights[i] > maxh) {
    //             maxh = heights[i];
    //         }
    //     }
    //     int ans = 0;
    //     for (int i = 1; i <= maxh; i++) {
    //         int h = 0;
    //         for (int j = 0; j < heights.length; j++) {
    //             if (heights[j] >= i) {
    //                 h += i;
    //             } else if (ans < h) {
    //                 ans = h;
    //                 h = 0;
    //             } else {
    //                 h = 0;
    //             }
    //         }
    //         if (ans < h) {
    //             ans = h;
    //         }
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(a));
        // largestRectangleArea(a);
    }

    public static int largestRectangleArea(int[] heights) {
        int[] nse = NSE(heights);
        int[] pse = PSE(heights);
        List<Integer> pred = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            int a = ((nse[i]) - (pse[i] + 1)) * heights[i];
            pred.add(a);
        }
        int maxa = 0;
        for (int i = 0; i < heights.length; i++) {
            if (pred.get(i) > maxa) {
                maxa = pred.get(i);
            }
        }
        return maxa;
    }

    public static int[] NSE(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = ans.length;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] PSE(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
