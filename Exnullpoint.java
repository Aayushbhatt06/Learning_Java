
public class Exnullpoint {
    
        void display(){
            try{
                String str=null;
                System.out.println(str.length());
            }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Exception Handeled");
        }
        public static void main(String[] args) {
            Exnullpoint obj=new Exnullpoint();
            obj.display();
        }
}
