package Java_codes;
import java.util.Scanner;
class cal{
    void add(double a, double b){
        System.out.println(a+b);
    }
    void sub(double a, double b){
        System.out.println(a-b);
    }
    void mul(double a, double b){
        System.out.println(a*b);
    }
    void div(double a, double b){
        System.out.println(a/b);
    }
    void root(double a){
        System.out.println(Math.sqrt(a));
    }
    void powe(double a, double b){
        System.out.println(Math.pow(a,b));
    }
}

public class Calculator1 extends cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter operation");
        String c= input.next();
        System.out.println("Enter a");
        int a= input.nextInt();
        System.out.println("Enter b");
        int b= input.nextInt();
        input.close();
        Calculator1 C1 = new Calculator1();
        if (c.equals("+")) {
            C1.add(a, b);
        } else if (c.equals("-")) {
            C1.sub(a, b);
        } else if (c.equals("*")) {
            C1.mul(a, b);
        } else if (c.equals("/")) {
            C1.div(a, b);
        } else if (c.equals("r")) {
            C1.root(a);
        } else if (c.equals("^")) {
            C1.powe(a, b);
        } else {
            System.out.println("Invalid input");
        }
        
    }
}
