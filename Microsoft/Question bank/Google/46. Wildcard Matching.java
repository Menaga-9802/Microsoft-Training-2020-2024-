class Solution {
    public boolean isMatch(String b, String a) {
        int n = a.length();
        int m = b.length();
        boolean prev[] = new boolean[m+1];
        prev[0] = true;
        for(int i=1;i<=n;i++){
            boolean curr[] = new boolean[m+1];
            curr[0] = a.charAt(i-1)=='*' && prev[0];
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1) || a.charAt(i-1)=='?') curr[j] = prev[j-1];
                else if(a.charAt(i-1)=='*') curr[j] = prev[j] || curr[j-1];
                else curr[j] = false;
            }
            prev = curr;
        }
        return prev[m];
    }
}
