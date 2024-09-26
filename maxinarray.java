public class maxinarray {
    static int largest(int[] a){
        int max = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,5,8,4,5,854};
        System.out.println(largest(a));
    }
}
