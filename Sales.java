
import java.util.Scanner;

interface People{
    void Emp1(int ID1,int Sale1);
    void Emp2(int ID2,int Sale2);
    void Emp3(int ID3,int Sale3);
    void Emp4(int ID4,int Sale4);
    void Emp5(int ID5,int Sale5);
}

class Sales implements People{
    public void Emp1(int ID1,int Sale1){
        System.out.println("ID = " + ID1 + "Sales = "+ Sale1);
    }
    public void Emp2(int ID2,int Sale2){
        System.out.println("ID = " + ID2 + "Sales = "+ Sale2);
    }
    public void Emp3(int ID3,int Sale3){
        System.out.println("ID = " + ID3 + "Sales = "+ Sale3);
    }
    public void Emp4(int ID4,int Sale4){
        System.out.println("ID = " + ID4 + "Sales = "+ Sale4);
    }
    public void Emp5(int ID5,int Sale5){
        System.out.println("ID = " + ID5 + "Sales = "+ Sale5);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Detils of Employee 1");
        int ID1= input.nextInt();
        int Sale1= input.nextInt();
        System.out.println("Enter Detils of Employee 2");
        int ID2= input.nextInt();
        int Sale2= input.nextInt();
        System.out.println("Enter Detils of Employee 3");
        int ID3= input.nextInt();
        int Sale3= input.nextInt();
        System.out.println("Enter Detils of Employee 4");
        int ID4= input.nextInt();
        int Sale4= input.nextInt();
        System.out.println("Enter Detils of Employee 5");
        int ID5= input.nextInt();
        int Sale5= input.nextInt();

        int Greatest;
        Sales S1=new Sales();
        S1.Emp1(ID1, Sale1);
        S1.Emp2(ID2, Sale2);
        S1.Emp3(ID3, Sale3);
        S1.Emp4(ID4, Sale4);
        S1.Emp5(ID5, Sale5);
        System.out.println("Average sale is = "+ (Sale1+Sale2+Sale3+Sale4+Sale5)/5);
        if ((Sale1 >= Sale2) && (Sale1 >= Sale3) && (Sale1 >= Sale4) && (Sale1 >= Sale5)) { 
            Greatest=Sale1;
        } else if ((Sale2 >= Sale3) && (Sale2 >= Sale4) && (Sale2 >= Sale5)) {      
            Greatest=Sale2;
        } else if ((Sale3 >= Sale4) && (Sale3 >= Sale5)) {                 
            Greatest=Sale3;
        } else if (Sale4 >= Sale5) {                                
            Greatest=Sale4;
        } else {                                            
            Greatest=Sale5;
        }
        if(Greatest==Sale1){
            System.out.println("Highest sale ws done by Employee 1 id " + ID1 +" of amount = " + Sale1);
        }
        else if(Greatest==Sale2){
            System.out.println("Highest sale ws done by Employee 2 id " + ID2 +" of amount = " + Sale2);
        }
        else if(Greatest==Sale3){
            System.out.println("Highest sale ws done by Employee 3 id " + ID3 +" of amount = " + Sale3);
        }
        else if(Greatest==Sale4){
            System.out.println("Highest sale ws done by Employee 4 id " + ID4 +" of amount = " + Sale4);
        }
        else if(Greatest==Sale5){
            System.out.println("Highest sale ws done by Employee 5 id " + ID5 +" of amount = " + Sale5);
        }
        int mini;
        if ((Sale1 < Sale2) && (Sale1 < Sale3) && (Sale1 < Sale4) && (Sale1 < Sale5)) { 
            mini=Sale1;
        } else if ((Sale2 < Sale3) && (Sale2 < Sale4) && (Sale2 < Sale5)) {      
            mini=Sale2;
        } else if ((Sale3 < Sale4) && (Sale3 < Sale5)) {                  
            mini=Sale3;
        } else if (Sale4 < Sale5) {                                
            mini=Sale4;
        } else {                                            
            mini=Sale5;
        }
        if(mini==Sale1){
            System.out.println("Lowest sale ws done by Employee 1 " + ID1 +" of amount = " + Sale1);
        }
        else if(mini==Sale2){
            System.out.println("Lowest sale ws done by Employee 2 " + ID2 +" of amount = " + Sale2);
        }
        else if(mini==Sale3){
            System.out.println("Lowest sale ws done by Employee 3 " + ID3 +" of amount = " + Sale3);
        }
        else if(mini==Sale4){
            System.out.println("Lowest sale ws done by Employee 4 " + ID4 +" of amount = " + Sale4);
        }
        else if(mini==Sale5){
            System.out.println("Lowest sale ws done by Employee 5 " + ID5 +" of amount = " + Sale5);
        }
        System.out.println("Enter the Goal");
        int aim=input.nextInt();
        if(Sale1>aim){
            System.out.println("The Salesmen "+ ID1 +"got Sales more than "+aim+"with sales of "+Sale1);
        }
        if(Sale2>aim){
            System.out.println("The Salesmen "+ ID2 +"got Sales more than "+aim+"with sales of "+Sale2);
        }
        if(Sale3>aim){
            System.out.println("The Salesmen "+ ID3 +"got Sales more than "+aim+"with sales of "+Sale3);
        }
        if(Sale4>aim){
            System.out.println("The Salesmen "+ ID4 +"got Sales more than "+aim+"with sales of "+Sale4);
        }
        if(Sale5>aim){
            System.out.println("The Salesmen "+ ID5 +"got Sales more than "+aim+"with sales of "+Sale5);
        }
        int count=0;
        if(Sale1>aim){
            count+=1;

        }
        if(Sale2>aim){
            count+=1;

        }
        if(Sale3>aim){
            count+=1;

        }
        if(Sale4>aim){
            count+=1;

        }
        if(Sale5>aim){
            count+=1;

        }
        System.out.println(count + " number of employees achieved goal");

    }
}