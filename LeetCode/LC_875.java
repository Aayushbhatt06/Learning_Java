package LeetCode;

public class LC_875 {

    public static int minEatingSpeed(int[] piles, int h) {
        int e = 0;
        int s = 1;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > e) {
                e = piles[i];
            }
        }
        int ans = e;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (isEatable(piles, h, m)) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

    public static boolean isEatable(int[] piles, int h, int k) {
        int t = 0; // this is the hours required with current k
        int[] temp = new int[piles.length];
        for (int i = 0; i < piles.length; i++) {
            temp[i] = piles[i];
        }
        for (int i = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                temp[i] = temp[i] - k;
                t++;
            }
        }
        if (t <= h) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(piles, 8));
    }
}
