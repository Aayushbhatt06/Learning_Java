
import java.util.ArrayList;

public class dice {
    static ArrayList<String> soln(String p, int up){
        if(up == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= up ; i++){
            list.addAll(soln(p+i, up-i));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(soln("", 10));
    }
}
