
public class GFG_countSubstrings {

    public static int countSubstring(String s) {
        // code here
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[3];
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c - 'a']++;
                boolean t = true;
                for (int z = 0; z < 3; z++) {
                    if (freq[z] == 0) {
                        t = false;
                    }
                }
                if (t) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
