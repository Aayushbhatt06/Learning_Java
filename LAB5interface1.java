
interface Shapes{
    void rect();
    void circ();
}

class LAB5interface1 implements Shapes{
    public void rect(){
        System.out.println("Drawing rectangle");
    }
    public void circ(){
        System.out.println("drawing circle");
    }
    public static void main(String[] args) {
        LAB5interface1 O=new LAB5interface1();
        O.circ();
        O.rect();

    }

}