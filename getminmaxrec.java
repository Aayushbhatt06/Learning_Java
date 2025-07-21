
import java.util.Arrays;

public class getminmaxrec {
    static int getMinRec(int[] arr, int n) {

        // Base case: only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find min in rest of the array
        int minInRest = getMinRec(arr, n - 1);

        // Return the smaller value between 
        // last element and recursive min
        if (arr[n - 1] < minInRest) {
            return arr[n - 1];
        } else {
            return minInRest;
        }
    }

    static int getMaxRec(int[] arr, int n) {

        // Base case: only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find max in rest of the array
        int maxInRest = getMaxRec(arr, n - 1);

        // Return the larger value between last
        // element and recursive max
        if (arr[n - 1] > maxInRest) {
            return arr[n - 1];
        } else {
            return maxInRest;
        }
    }

    static int[] findMinMax(int[] arr) {

        int n = arr.length;

        int minValue = getMinRec(arr, n);
        int maxValue = getMaxRec(arr, n);

        return new int[] {minValue, maxValue};
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        // int[] res = findMinMax(arr);

        // System.out.println("min = " + res[0] + ", max = " + res[1]);
        System.out.println(Arrays.toString(helper(arr)));
    }

    static int min(int[] a,int si,int min){
        if(a.length<2){
            return a[0];
        }
        if(si == a.length-1){
            return min;
        }
        if(a[si] < min){
            return min = min(a, si+1, a[si]);
        }else{
            return min = min(a, si+1, min);
        }

    }

    static int max(int[] a,int si,int max){
        if(a.length<2){
            return a[0];
        }
        if(si == a.length-1){
            return max;
        }
        if(a[si] > max){
            return max = max(a, si+1, a[si]);
        }else{
            return max = max(a, si+1, max);
        }

    }

    static int[] helper(int[] a){
        int[] ans = new int[2];
        ans[0] = min(a, 0, Integer.MAX_VALUE);
        ans[1] = max(a, 0, Integer.MIN_VALUE);
        return ans;
    }
}
