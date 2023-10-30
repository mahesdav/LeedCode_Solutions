class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length==1)
          return nums[0];
        Arrays.sort(nums);
        int thresholdVal = nums.length / 2;
        int currentElement = nums[0];
        int maxFreqElement = nums[0];
        int maxFreq = 1;
        int currentFreq=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == currentElement){
                currentFreq++;

                if( currentFreq > maxFreq){
                   maxFreq = currentFreq;
                   maxFreqElement = nums[i];
                }
            }else{
                currentFreq = 1;
                currentElement = nums[i];
            }
        }

        // Map<Integer,Integer> map = new HashMap();

        // for(int i=0;i<nums.length;i++){

        //     if(map.containsKey(nums[i])){
        //         int val = map.get(nums[i]);
        //         map.put(nums[i],val+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }

        //  //   map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // int thresholdVal = nums.length / 2;
        // int maxFreqElement = Integer.MIN_VALUE;
        // for(int key : map.keySet()){
        //     if(map.get(key) > thresholdVal)
        //        maxFreqElement = key;
        // }

        return maxFreqElement;

        
    }
}