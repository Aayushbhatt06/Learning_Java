public class LC_754 {
    public static int reachNumber(int target) {
        if (target < 0) {
            target += -1 * (target * 2);
        }
        int sum = 0;
        int steps = 0;
        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }
}
