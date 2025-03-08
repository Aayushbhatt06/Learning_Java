public class LC_1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        // String a = s1;
        // String b = s2;
        StringBuilder ans = new StringBuilder(s2);
        if(s1.equals(s2)){
            return true;
        }

        for(int i = 0 ; i < s2.length(); i++){
            for(int j = i ; j < s2.length() ; j++){
                char temp = ans.charAt(i);
                ans.setCharAt(i, ans.charAt(j));
                ans.setCharAt(j, temp);
                System.out.println(ans.toString());
                // StringBuilder sa1 = new StringBuilder(s1);
                if(s1.equals(ans.toString())){
                    return true;
                }
                temp = ans.charAt(i);
                ans.setCharAt(i, ans.charAt(j));
                ans.setCharAt(j, temp);
                System.out.println(ans.toString());

            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
