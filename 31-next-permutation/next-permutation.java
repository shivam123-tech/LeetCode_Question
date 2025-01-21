class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            return ;
        }
            for(int j=nums.length-1;j>pivot;j--){
                if(nums[j]>nums[pivot]){
                    int temp=nums[j];
                    nums[j]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
            int si=pivot+1;
            int ei=nums.length-1;
            while(si<ei){
                int temp=nums[si];
                nums[si]=nums[ei];
                nums[ei]=temp;
                si++;
                ei--;
            }
        }
}