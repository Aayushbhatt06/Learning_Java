public class LC_744 {
    public static void main(String[] args) {
        char[] arr = {'x', 'x', 'y', 'y'};
        char ans = ceiling(arr, 'x');
        System.out.println(ans);
    }

    static char ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
