class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length-1;
        int minElement = prices[0];
        int indexOfMinElement = 0;
        int changedIndex = indexOfMinElement;

        int maxProfit = 0;
        int finalProfit = 0;
        int i=0;
        int j=1;
        boolean isINdexChange = false;
        while(i<j && i<=len && j<=len){

            if(prices[j] < prices[i] || prices[j] < prices[j-1]){
                if(prices[j] < prices[j-1]){
                   isINdexChange = true;
                finalProfit += maxProfit;
                maxProfit = 0;
                }
                minElement = prices[j];
                indexOfMinElement = j;
                i=j;
                j++;
            }else if(prices[j] > prices[i]){
                int diff = prices[j]-prices[i];
                // if(isINdexChange){
                //     maxProfit +=diff;
                //     isINdexChange = false;
                // }
                // else
                if(diff > maxProfit)
                  maxProfit = diff;
                j++;
            }else
              j++;

        }

        if(!isINdexChange)
            finalProfit = maxProfit;
        else
          finalProfit += maxProfit;
        return finalProfit;
        
    }
}