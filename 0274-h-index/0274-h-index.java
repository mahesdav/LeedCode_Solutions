class Solution {
    public int hIndex(int[] citations) {

        // to solve this problem, we'll use Binary search'
        // sort the input array
        //citations = [3,0,6,1,5]

        // int len = citations.length-1;
        // int max = len;
        // int min = 0;
        // int hIndex = 0;
        // Arrays.sort(citations); // [0,1,3,5,6]
        // while(min <= max){
        //     int mid = min+(max-min)/2;
        //     if(citations[mid] >= (len-mid) && (hIndex <= (len-mid))){
        //         hIndex = mid;// citations[mid];
        //         min=mid+1;
        //     }else{
        //         max=mid-1;
        //     }
            
        // }
        // return hIndex;
        int n = citations.length;
    int[] buckets = new int[n+1];
    for(int c : citations) {
        if(c >= n) {
            buckets[n]++;
        } else {
            buckets[c]++;
        }
    }
    int count = 0;
    for(int i = n; i >= 0; i--) {
        count += buckets[i];
        if(count >= i) {
            return i;
        }
    }
    return 0;
    }
}