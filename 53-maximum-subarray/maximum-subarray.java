class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int negative=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
            // if(maxSum<sum){
            //     maxSum=sum;
            // }
        }
        return maxSum;
    }
    
}