package Java_codes;
import java.util.Scanner;

interface AreaofShapes{
    void arrect(int a,int b);
    void arcirc(int c);
}

class LAB5AreaInterface implements AreaofShapes{
    public void arrect(int a,int b){
        System.out.println("Area of rect is = " + a*b);
    }
    public void arcirc(int c){
        System.out.println("Area of circle is = " + 3.14*c*c);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        LAB5AreaInterface A1=new LAB5AreaInterface();
        A1.arrect(a,b);
        A1.arcirc(c);
    }
}

