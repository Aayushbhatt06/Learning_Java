import java.util.ArrayList;
import java.util.List;

public class LC_118 {
    public static void main(String[] args) {
        
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = 1;
        for (int i = 0; i < numRows; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(j==0 || j == i){
                    a.add(1);
                }
                else{
                    a.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            n++;
            ans.add(a);
        }
        return ans;
    }
}
