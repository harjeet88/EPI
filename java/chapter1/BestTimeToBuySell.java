class Solution {
    public int maxProfit(int[] prices) {
        int min_indx=0;
        int max_profit=0;
        for(int i=0; i< prices.length ; i++){
            int profit = prices[i] - prices[min_indx];
            
            if(profit>max_profit){
                max_profit = profit;
                
            }else if (profit < 0){
                min_indx=i;
            }
        }
        return max_profit;
        
    }
}
