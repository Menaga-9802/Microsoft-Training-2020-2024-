class Solution {
    public int maxProfit(int[] prices) {
      int buy=Integer.MAX_VALUE;
      int profit=0;
      for(int i=0;i<prices.length;i++){
        if(prices[i]<buy){
            buy=prices[i];
        }
         else{
             int diff=prices[i]-buy;
             profit=Math.max(diff, profit);
         }
      }
      return profit;
   }
}
