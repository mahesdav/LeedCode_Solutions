class Solution {
    public int[] productExceptSelf(int[] nums) {

        // to solve this problem, we need to use 2 arrays
// 1.Left product array : this will have product of all integers till current_index-1
// 2.Right product array : this will have product of all integers from current_index+1 to array.length-1
// if index i has left elements and right elements, then take product of value at leftProductArray[i-1] * rightProductArray[i+1]
//if i =0, then final result would be : rightProductArray[i+1]
//if i=array.length-1, then final result would be : leftProductArray[i-1]

    int[] leftProductArray = new int[nums.length];
    int[] rightProductArray = new int[nums.length];
    
    int len = nums.length-1;
    int j=len;
    for(int i=0;i<=len;i++){
        if(i==0){
          leftProductArray[i]=nums[i];
        }else{
            leftProductArray[i]=nums[i]*leftProductArray[i-1];
        }

        j = len-i;
        if(j==len){
          rightProductArray[j]=nums[j];
        }else{
            rightProductArray[j]=nums[j]*rightProductArray[j+1];
        }
    }

    for(int i=0;i<=len;i++){
        if(i==0){
            nums[i] = rightProductArray[i+1];
        }else if(i==len){
            nums[i] = leftProductArray[i-1];
        }else{
            nums[i] = leftProductArray[i-1] * rightProductArray[i+1];
        }
    }
        return nums;
    }
}