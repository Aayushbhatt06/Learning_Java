<<<<<<< HEAD
public class prime {
    static Boolean isPrime(int a){
        boolean isprime = true;
        for(int i = 2 ; i<a/2 ; i++){
            if(a % i == 0){
                isprime = false;
                return isprime;
            }
            
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5471));
    }
}
=======
package Java_codes;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int num=sc.nextInt();
        int i;
        int temp;
        int flag = 0;
        for(i=2;i<num;i++){
            temp=num%i;
            if(temp!=0){
                flag = 1;
            } else {
                flag = 0;
                break;
            }
            }

            if(flag == 1) {
                System.out.println("prime number");
            } else {
                System.out.println("not a prime");
            }
        }


    }

>>>>>>> 0366a03cb573a409f3376be9a787e5cd4621ccdc
