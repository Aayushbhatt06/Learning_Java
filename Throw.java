
public class Throw {
    public static void dividebyzero() {
        throw new ArithmeticException("Trying to devide by 0");
    }
    public static void main(String[] args) {
        dividebyzero();
    }
}
