
class LC_84 {

    public static int largestRectangleArea(int[] heights) {
        int maxh = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxh) {
                maxh = heights[i];
            }
        }
        int ans = 0;
        for (int i = 1; i <= maxh; i++) {
            int h = 0;
            for (int j = 0; j < heights.length; j++) {
                if (heights[j] >= i) {
                    h += i;
                } else if (ans < h) {
                    ans = h;
                    h = 0;
                } else {
                    h = 0;
                }
            }
            if (ans < h) {
                ans = h;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
        System.out.println(largestRectangleArea(a));
    }
}
