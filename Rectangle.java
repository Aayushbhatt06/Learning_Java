
class testRectangle {
    int length;
    int width;
    void insert(int L,int W){
        length=L;
        width=W;
    }
    void calculateArea(){
        System.out.println(length*width);
    }
    
}
class Rectangle{
    public static void main(String[] args) {
        testRectangle R1=new testRectangle();
        testRectangle R2=new testRectangle();
        R1.insert(5,5);
        R2.insert(20,10);
        R1.calculateArea();
        R2.calculateArea();
    }
}
