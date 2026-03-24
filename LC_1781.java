class LC_1781{
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int[] freq = new int[26];
            for(int j = i ; j < n ; j++){
                char c = s.charAt(j);
                freq[c-'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int f : freq){
                    if(f > 0){
                        min = Math.min(min,f);
                        max = Math.max(max,f);
                    }
                }
                ans += max - min;
            }
        }
        return ans;
    }
}