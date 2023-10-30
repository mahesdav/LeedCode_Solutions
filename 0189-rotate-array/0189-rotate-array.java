class Solution {
    public void rotate(int[] nums, int k) {

        // solution with O(1) space complexity (start)
        // reverse the array first
        //then, reverse subarray from 0-(k-1) and k-(nums.length-1)
        if(nums.length<=k)
          k=k%nums.length;
        int len = nums.length-1;
        int i=0;
        int j=len;
        // reverse the array
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        //now reverse the subarray from 0 to (k-1)
        i=0;
        j=k-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        //now reverse the subarray from k to (nums.length-1)
        i=k;
        j=len;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        // solution with O(1) space complexity (end)


        // solution with O(n) space complexity (start)

        // if(nums.length==1){
        //     return;
        // }

        // int[] result = new int[nums.length];
        // int j=0;
        // if(k>nums.length){
        //     k = k%nums.length;
        // }
          
        // for(int i=nums.length-k;i<nums.length;i++){
        //     result[j]=nums[i];
        //        System.out.println("result[j] is : " + result[j]);
        //     j++;
        // }
        // for(int i=0;i<nums.length-k;i++){  
        //     result[j]=nums[i];
        //      System.out.println("result[j] is : " + result[j]);
        //     j++;
        // }
        // for(int i=0;i<result.length;i++){
        //     nums[i]=result[i];
        // }

        //  solution with O(n) space complexity (end)
    }
}