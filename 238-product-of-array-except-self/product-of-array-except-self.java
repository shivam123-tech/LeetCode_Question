class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] =new  int[nums.length];
        // int prefix[]=new int[nums.length];
        // int suffix[]=new int[nums.length];

         ans[0] =1;
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        } 

          int suffix =1;
        for(int i=nums.length-2;i>=0;i--){
           suffix *= nums[i+1];
           ans[i] *= suffix;
        }

        // for(int i=0;i<nums.length;i++){
        //     ans[i] = prefix[i]*suffix[i];
        // }
        return ans;
    }
}