
public class Exnumformat {
    void display(){
        try{
            String str="Hello";
            int num=Integer.parseInt(str);
        }
    catch(NumberFormatException e){
        System.out.println(e);
    }
    System.out.println("Exception Handeled");
    }
    public static void main(String[] args) {
        Exnumformat obj=new Exnumformat();
        obj.display();
    }
}
