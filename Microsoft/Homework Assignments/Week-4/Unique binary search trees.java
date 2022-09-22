class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    private int helper(int n,int[] dp){
        if(n<1) return 0;
        if(n==1) return 1;
        if(dp[n] != -1){
            return dp[n];
        }
        int count=0;
        for(int i=1;i<=n;i++){
            int left=helper(i-1,dp);
            if(left==0) left= 1;
            int right=helper(n-i,dp);
            if(right == 0 ) right= 1;
            count+= left*right;
        }
        return dp[n]=count;
    }
}
