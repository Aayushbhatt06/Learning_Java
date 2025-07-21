
import java.util.ArrayList;

public class substring {
    public static void main(String[] args) {
        String a = "abc";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(substrings("",a,list));
    }

    private static ArrayList<String> substrings(String p,String up,ArrayList<String> list) {
        if(up.isEmpty()){per
            list.add(p);
            System.out.println(p);
            return list;
        }
        char ch = up.charAt(0);
        substrings(p + ch, up.substring(1),list);
        substrings(p, up.substring(1),list);
        return list;
    }
}
