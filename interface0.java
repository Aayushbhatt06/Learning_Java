package Java_codes;
interface printable{
    void print();
}
class interface0 implements printable{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        interface0 obj = new interface0();
        obj.print();
    }
}