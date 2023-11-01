class Solution {
    public int candy(int[] ratings) {

        int len = ratings.length;
        if(len==1)
          return 1;
        int[] arr = new int[len];
        Arrays.fill(arr,1);
        int totalCandies = 0;

        for(int i=1;i<len;i++){
            if(ratings[i-1] < ratings[i])
               arr[i] = arr[i-1]+1;
        }

        for(int i=len-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && arr[i] <= arr[i+1]){
                arr[i] = arr[i+1]+1;
            }
        }

        for(int i=0;i<len;i++){
            totalCandies += arr[i];
        }
        return totalCandies;
    }
}