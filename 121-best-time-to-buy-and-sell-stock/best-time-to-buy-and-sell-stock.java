class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<prices.length;i++){
             
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                p=Math.max(p,prices[i]-buy);
            }
        }
           return p;
    }
}