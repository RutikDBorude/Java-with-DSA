class Solution {
    public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     for(int i=0;i<=n;i++){
    //         boolean found = false;

    //         for(int num : nums){
    //             if(i == num){
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if(!found){
    //             return i;
    //         }
    //     }
    //     return -1;

        
        int n = nums.length;
        int expectedSum = n *(n+1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}