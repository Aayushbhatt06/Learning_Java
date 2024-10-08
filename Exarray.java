
public class Exarray {
    void display(){
        try{
            int a[]=new int[5];
            a[6]=5;
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    System.out.println("Exception Handeled");
    }
    public static void main(String[] args) {
        Exarray obj=new Exarray();
        obj.display();
    }
}
