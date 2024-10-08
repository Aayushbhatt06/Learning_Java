
class Employee { 
    String name;
    int id;
    int money=0;
    
    public void insert(String Name,int ID){
        name=Name;
        id=ID;

    }
    public void deposit(int amt){
        money+=amt;

    }
    public void withdraw(int amt){
        if((money-amt) >0)
         money-=amt;
        else
        System.out.println("not enough balance");
    }
    public void printVar(){
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("balance "+money);
    }
    
    
}
class Bank{
    public static void main(String[] args) {
        
    
    Employee E1=new Employee();
    Employee E2=new Employee();
    E1.insert("Aayush",863);
    E1.deposit(2500);
    E1.withdraw(500);
    E1.printVar();
    E2.insert("Atharva",9423);
    E2.deposit(5600);
    E2.withdraw(1000);
    E2.printVar();
    }
}
