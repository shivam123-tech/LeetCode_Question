class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
        int dp=0;
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    dp=nums[i]; 
                }
        }
        return dp;
    }
}