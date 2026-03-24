
import java.util.*;

class LC_2483 {

    public static int bestClosingTime(String customers) {
        int ny = 0;
        HashMap<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                ny++;
            }
        }
        l.put(0, ny);
        int curr = ny;
        for (int i = 0; i < customers.length(); i++) {
            int penalty = 0;
            if (customers.charAt(i) == 'Y') {
                penalty = curr - 1;
                curr--;
            } else {
                penalty = curr + 1;
                curr++;
            }
            l.put(i + 1, penalty);
        }
        int min = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) < ans) {
                ans = l.get(i);
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String a = "YYNY";
        System.out.println(bestClosingTime(a));
    }
}
