
public class Calculator{
    double i;
    double j;
    void add(double i, double j){
        System.out.println(i+j);
    }
    void sub(double i, double j){
        System.out.println(i-j);
    }
    void mul(double i,double j){
        System.out.println(i*j);
    }
    void div(double i,double j){
        System.out.println(i/j);
    }
    
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.div(9.25658, 0);
    }
}
// we wrote double instead of float because it was giving errors in worst cases like i=9.125486487 and j=645.66858496 etc.