class Solution {
    public int removeElement(int[] nums, int val) {

        int i=0;
        int j=nums.length-1;
      //  int count = 0;

        while(i<j){
            if(nums[i]==val && nums[j]!=val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
             //   count++;
            }
            if(nums[i] !=val){
                i++;
            }
            if(nums[j]==val)
              j--;
        }
        i=0;
        for(int key : nums){
            if(key!=val)
              i++;
        }

        return i;
    }
}