
import java.util.Scanner;

public class Lecture1 {
    static String name;
    void insert(String name) {
          this.name = name;
    }
    static void display() {
        System.out.println(name);
    }
    Lecture1(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        System.out.println("l1");
        // Lecture1 obj = new Lecture1("Abhijeet");
        // obj.display();
        // Scanner sc = new Scanner(System.in);
        // int a  = sc.nextInt();
        // System.out.println(a);
        // int b = sc.nextInt();
        // System.out.println(b);

        Lecture2 obj = new Lecture2("Abhijeet");
        Lecture1.display();

    }
}

class Lecture2 extends Lecture1{

    Lecture2(String name) {
        super(name);
    }
    Lecture1 obj = new Lecture1("Abhijjet");
}