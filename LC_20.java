
import java.util.Stack;

public class LC_20 {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        while(s.length()>0){
            if (st.isEmpty()) {
                if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
                    return false;
                }
            }
            if (s.charAt(0) == '(' || s.charAt(0) == '{' || s.charAt(0) == '[') {
                st.push(s.charAt(0));
            } else if (st.peek() == '(' && s.charAt(0) == ')') {
                st.pop();
            } else if (st.peek() == '{' && s.charAt(0) == '}') {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(0) == ']') {
                st.pop();
            } else {
                return false;
            }
            s = s.substring(1, s.length());
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "(([{{()}}])({}))";
        System.out.println(isValid(s));
    }
}
