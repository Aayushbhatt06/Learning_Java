import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LC_987 {
    int min = 0;
    public static void helper(TreeNode n, int i, int j, List<List<Integer>> ans){
        if(n == null){
            return;
        }
        if(min > j){
            min = j;
        }
        helper(n.left,i+1,j-1,ans);
        helper(n.right, i + 1, j + 1, ans);
        if(ans.size() < j-min+1){
            List<Integer> ls = new ArrayList<>();
            ls.add(n.val);
            ans.add(ls);
        }else{
            ans.get(j-min).add(n.val);
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
