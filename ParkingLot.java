
class ParkingLot {
    int vno;
    int hours;
    double bill;
    void input(int vno,int hours){
        this.vno=vno;
        this.hours=hours;
    }
    void calculate(){
        if(hours<=1){
            bill=3;
        }else{
            bill=1.50*(hours-1)+3;
        }
    }
    void display(){
        System.out.println("Vehicle number= "+ vno);
        System.out.println("No of hours= "+ hours);
        System.out.println("Your Bill is="+bill);
    }
    public static void main(String[] args) {
        ParkingLot p=new ParkingLot();
        p.input(9111, 5);
        p.calculate();
        p.display();
    }
}
