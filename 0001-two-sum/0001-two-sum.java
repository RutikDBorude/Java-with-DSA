class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        if(2 <= nums.length && nums.length <= Math.pow(10,4) && target<=Math. pow(10,9) && (-(Math.pow(10,9))<=target)){
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=Math.pow(10,9) && (-(Math.pow(10,9)))<=nums[i]){
                    for(int j = i+1;j<nums.length;j++){
                        if(nums[i]+nums[j]==target){
                            ans[0]= i;
                            ans[1]=j;
                        }
                    }
                }
            }
        }
        return ans;
    }
}