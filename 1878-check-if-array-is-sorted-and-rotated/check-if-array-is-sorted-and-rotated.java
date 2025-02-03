class Solution {
    public boolean check(int[] nums) {
        int pair=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                pair++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            pair++;
        }
        if(pair<=1){
            return true;
        }
        return false;
    }
}