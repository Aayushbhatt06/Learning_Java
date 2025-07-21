class LC_1957{
    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }


    public static String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        ans.append(s.charAt(0));
        for(int i =1 ; i < s.length() ; i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
