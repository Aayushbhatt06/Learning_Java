
import java.util.Arrays;

class binserarr{

    static int[] search(int[][] arr, int target){
        int r = arr.length;
        int c = arr[0].length;

        int ptr = 0;
        int ptc = c-1;
        int [] ans = {};
        while(ptr<=r && ptc >=0){
            if (arr[ptr][ptc] == target){
                return new int[]{ptr,ptc};
            }
            else if(arr[ptr][ptc]>target){
                ptc = ptc - 1;

            }
            else{
                ptr = ptr+1;
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,37)));  
    }
}