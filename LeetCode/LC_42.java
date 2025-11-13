package LeetCode;

class LC_42 {

    public static int trap(int[] height) {
        int i = 0;
        int j = 1;
        int ans = 0;
        int t = 0;
        while (i < height.length - 1) {
            if (height[i] == 0) {
                i++;
                j = i + 1;
                continue;
            }
            if (height[i] > height[j]) {
                if (height[j] != 0) {
                    t += height[j];
                }
                j++;
                if (j == height.length) {
                    i++;
                    j = i + 1;
                    t = 0;
                }
                continue;
            } else {
                int w = j - i - 1;
                int a = height[i] * w;
                ans += a - t;
                t = 0;
                i = j;
                j = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {4,2,3};
        System.out.println(trap(height));
    }
}
