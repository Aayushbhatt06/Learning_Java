package Java_codes;
import java.io.*;
public class Throws {
    public static void findFile() throws IOException {
        File newFile= new File("test.txt");
        FileInputStream Stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try{
            findFile();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
