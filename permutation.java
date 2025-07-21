
import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        System.out.println(pergenCount("", "abc"));
    }

    public static void pergen(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String s = p.substring(0, i);
            String f = p.substring(i, p.length());
            pergen(s + ch + f, up.substring(1));
        }


    }

    public static ArrayList<String> pergenList(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String s = p.substring(0, i);
            String f = p.substring(i, p.length());
            ans.addAll(pergenList(s + ch + f, up.substring(1)));
        }
        return ans;

    }

    public static int pergenCount(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String s = p.substring(0, i);
            String f = p.substring(i, p.length());
            count = count + pergenCount(s + ch + f, up.substring(1));
        }
        return count;

    }
    
}
