class Solution {
    public int trap(int[] height) {

        // to solve this problem, we will use additional arrays to track the max height bar on left side
        // and another array to store max height bar on right side
        // then we'll iterate original Arraya and check the minimum of min(left[i],right[i])-height[i]
        // if value of min(left[i],right[i])-height[i] >=0, add it it the final result

        int len = height.length-1;
        if(len==1)
          return 0;
        int[] left = new int[len+1];
        int[] right = new int[len+1];
        int result= 0;

        int maxHeightOnLeft = Integer.MIN_VALUE;
        int maxHeightOnRight = Integer.MIN_VALUE;

        for(int i=0;i<=len;i++){
            if(height[i] > maxHeightOnLeft){
                maxHeightOnLeft = height[i];
            }

            left[i] = maxHeightOnLeft;
              
        }

        for(int i=len;i>=0;i--){
            if(height[i] > maxHeightOnRight){
                maxHeightOnRight = height[i];
            }

            right[i] = maxHeightOnRight;
              
        }

        for(int i=0;i<=len;i++){
            int minHeight = Math.min(left[i],right[i]);
            result += minHeight-height[i];
        }
        return result;
    }
}