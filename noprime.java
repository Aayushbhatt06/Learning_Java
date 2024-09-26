package Java_codes;
import java.util.Scanner;
public class noprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int flag=0;
        int temp=0;
        int prime=1;
        for(int i=2;i<=n;i++){
            for(int j=2;j<i;j++){
                temp=i%j;
                flag=0;
                if(temp!=0){
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
                }
            if(flag == 1) {
                prime +=1;
            }
        }
        System.out.println("prime= "+prime);
        
    }
}
