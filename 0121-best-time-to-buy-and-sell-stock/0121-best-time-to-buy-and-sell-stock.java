class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length-1;
        int minElement = prices[0];
        int indexOfMinElement = 0;

        int i=0;
        int j=1;
        int maxProfit = 0;

        while(i<j && i<=len && j<=len){
            if(prices[i]>prices[j]){
                minElement = prices[j];
                indexOfMinElement = j;
                i = j;
                j++;
            }else if(prices[j]-prices[i] > maxProfit){
                maxProfit = prices[j]-prices[i];
                j++;
            }else
              j++; 
            
        }

        return maxProfit;
        
    }
}