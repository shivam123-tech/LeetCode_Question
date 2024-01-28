class Solution {
    public int maxProfit(int[] prices) {
        int buyStock= Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
         for(int i=0;i<prices.length;i++){
             if(buyStock<prices[i]){
                  profit=prices[i]-buyStock;
                 maxProfit += profit;
             }
                 buyStock= prices[i];
             
         }
         if(maxProfit<0){
             return 0;
         }
         return maxProfit;
    }
}