package Java_codes;
import java.io.File;
import java.io.IOException;
public class virrrrr {
    //create a file.
    public static void main(String[] args) {
        try{
            File f1=new File("C:Games:myFile.txt");
            if(f1.createNewFile()){
                System.out.println("File "+ f1.getName()+" is created successfully");

            }else{
                System.out.println("File is already exist in the directory");
            }
        }catch(IOException exception){
            System.out.println("An unexpected error is occured.");
            exception.printStackTrace();
        }
    }


}
