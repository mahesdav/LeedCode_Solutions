class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length==1){
            return;
        }

        int[] result = new int[nums.length];
        int j=0;
        if(k>nums.length){
    //         int n = nums.length;
    //         for (int i = 0; i < n / 2; i++) {
    //     int temp = nums[i];
    //     nums[i] = nums[n - i - 1];
    //     nums[n - i - 1] = temp;
    // }
    //         return;
    k = k%nums.length;
        }
          
        for(int i=nums.length-k;i<nums.length;i++){
            result[j]=nums[i];
               System.out.println("result[j] is : " + result[j]);
            j++;
        }
      //   System.out.println("result.length is : " + result.length);
        for(int i=0;i<nums.length-k;i++){
           
            //  System.out.println("j is : " + j);
            //   System.out.println("nums[i] is : " + nums[i]);
               
            result[j]=nums[i];
             System.out.println("result[j] is : " + result[j]);
            j++;
        }
        for(int i=0;i<result.length;i++){
            nums[i]=result[i];
        }
       // return result;
    }
}