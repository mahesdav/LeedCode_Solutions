class Solution {
    public boolean canJump(int[] nums) {

        int reachableIndex = 0;

        for(int i=0;i<nums.length;i++){
            int reachableFromCurrentIndex = i + nums[i];
            if(i>reachableIndex)
              return false;
            else if(reachableFromCurrentIndex >= nums.length)
              return true;
            else if(reachableFromCurrentIndex > reachableIndex)
              reachableIndex = reachableFromCurrentIndex;
             
        }
        return true;
    }
}