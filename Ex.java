package Java_codes;
public class Ex {
    void display(){
        try{
            int a=5/0;

        }catch(ArithmeticException e){
            System.out.println(e);
        }
            System.out.println("Exception Handeled");
    }
    public static void main(String[] args) {
        Ex Nahihai= new Ex();
        Nahihai.display();
    }  
}
