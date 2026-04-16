class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
       
        int maxprofit=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                   int profit=prices[j]-prices[i];
                    if(maxprofit<profit){
                        maxprofit=profit;
                    }

                }
               
            }
        }
        return maxprofit;
    }
}
