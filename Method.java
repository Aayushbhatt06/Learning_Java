
class Fun {
    int id;
    String name;
    public void insert(int ID,String Name){
        id=ID;
        name=Name;

    }
    public void printVar(){
        System.out.println("Name "+name);
        System.out.println("ID "+id);

}
    
}
class Method{
    public static void main(String[] args) {
    Fun s1=new Fun();
    Fun s2=new Fun();
    s1.insert(03,"Aayush");
    s2.insert(21,"Atharva");
    s1.printVar();
    s2.printVar();
    // Lecture1 l1=new Lecture1();
    // l1.insert("Aayush");
    // l1.display();
    }
    
}