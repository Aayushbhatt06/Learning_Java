
public class Student5 {
    int id;
    String name;
    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student5() {
        System.out.println("This is a default constructor");
    }

    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student5 s = new Student5(3, "Aayush");
        s.display();
    }
}
