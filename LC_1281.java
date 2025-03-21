class LC_1281 {
    public static  int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        int len = 0;
        int a = n;
        int num;
        while(a>0){
            len ++;
            a = a/10;
        }
        for(int i = 0 ; i < len ; i ++){
            num = n%10;
            n = n/10;
            sum = sum + num;
            prod = prod * num;
        }
        int diff = prod - sum;
        return diff;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}