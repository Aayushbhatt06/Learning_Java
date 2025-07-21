import java.util.ArrayList;
import java.util.List;

public class LC_1431 {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        System.out.println(kidsWithCandies(a, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }
}
