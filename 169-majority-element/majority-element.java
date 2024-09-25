class Solution {
    public int majorityElement(int[] nums) {
      int frequ=0;int ans=0;
      for(int i=0;i<nums.length;i++){
        if(frequ==0){
            ans=nums[i];
        }
        if(ans==nums[i]){
            frequ++;
        }else{
            frequ--;
        }
      }
      return ans;
    }
    

}