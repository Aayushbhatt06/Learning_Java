
import java.util.ArrayList;
import java.util.List;

public class LC_17 {
    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return pad("",digits);
    }

    static ArrayList<String> pad(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p+"");
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<String>();
        if(digit == 7){
            for (int i = 0; i < 4; i++) {
                char ch = (char)('p' +i);
                list.addAll(pad(p+ch, up.substring(1)));
            }
        }

        else if(digit == 8){
            for (int i = 0; i < 3; i++) {
                char ch = (char)('t' +i);
                list.addAll(pad(p+ch, up.substring(1)));
            }
        }

        else if(digit == 9){
            for (int i = 0; i < 4; i++) { 
                char ch = (char)('w' +i);
                list.addAll(pad(p+ch, up.substring(1)));
            }
        }
        else{for (int i = (digit-2)*3; i < ((digit-2)*3)+3; i++) {
            char ch = (char)('a' +i);
            list.addAll(pad(p+ch, up.substring(1)));
        }}
        return list;

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
