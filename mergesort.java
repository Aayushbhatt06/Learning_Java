
import java.util.Arrays;

public class mergesort {
    static int[] divide(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = (arr.length/2);
        int[] L = Arrays.copyOfRange(arr, 0, mid);
        int[] R = Arrays.copyOfRange(arr, mid, arr.length);   
        
        L = divide(L);
        R = divide(R);
        return merge(L,R);

    }

    static int[] merge(int[] L,int[] R){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[L.length+R.length];

        while(i<L.length && j<R.length){
            if(L[i] < R[j]){
                mix[k] = L[i];
                i++;
                k++;
            }
            else{
                mix[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<L.length){
            mix[k] = L[i];
                i++;
                k++;
        }
        while(j<R.length){
            mix[k] = R[j];
                j++;
                k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,7,8,5,21,0,12,32,21};
        System.out.println(Arrays.toString(divide(arr)));
    }
}
