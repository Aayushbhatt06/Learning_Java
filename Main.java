
class Student{

     int id;
     
     String name;
     public void printVar(){
         System.out.println("Name= "+name);
         System.out.println("ID= "+id);
     }
     }class Main{
     
     public static void main(String args[]){
     
     Student s1=new Student();
     s1.id=03;
     s1.name="Aayush";
     s1.printVar();
     Student s2=new Student();
     s2.id=21;
     s2.name="Atharva";
     s2.printVar();
     
     }
     
     }