
import java.util.Arrays;

class selsort{

    static void selection(int[] arr,int a ,int e, int max){
        if(e == 0){
            return;
        }

        if(a<=e){
            if(arr[a] >= arr[max]){
                selection(arr, a+1, e, a);
            }
            else{
                selection(arr, a+1, e, max);
            }
        }if(a <= e){
            if(arr[a] >= arr[max]){
                selection(arr, a+1, e, a);
            }
            else{
                selection(arr, a+1, e, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[e];
            arr[e] = temp;
        
            selection(arr, 0, e-1, 0);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // System.out.println(Arrays.toString(selection(arr, 0, arr.length-1, Integer.MIN_VALUE)));
        selection(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}