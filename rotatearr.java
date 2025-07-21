
import java.util.Arrays;

class rotatearr{
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,8,9,9,1};
        rot(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rot(int[] a){
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;

    }
}