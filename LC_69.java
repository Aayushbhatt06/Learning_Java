public class LC_69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrtbrute(int x) {
        int possible = 1;
        if(x < 2){
            return x;
        }
        for(int i = 0 ; i <= x/2 ; i++){
            if(possible*possible <= x ){
                possible++;
            }else if(possible*possible > x){
                possible--;
                break;
            }
        }
        return possible;
    }

    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

}
