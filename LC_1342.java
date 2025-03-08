public class LC_1342 {
    public static int numberOfSteps(int num) {
            return helper(num,0);
        }
    
        public static int helper(int num, int i) {
            
            if(num == 0){
                return i;
            }
            if(num % 2 == 0){
                return helper(num/2,i+1);
            }
            return helper(num-1, i+1);
    
        }
    
        public static void main(String[] args) {
            int n = 14;
            System.out.println(numberOfSteps(n));
    }
}
