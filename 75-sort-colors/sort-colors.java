class Solution {
    public void sortColors(int[] nums) {
        int si=0;int ei=nums.length-1;
        quicksort(nums,si,ei);
    }
    public static void quicksort(int nums[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int pIndx=partion(nums,si,ei);
        quicksort(nums,si,pIndx-1);
        quicksort(nums,pIndx+1,ei);
    }
    public static int partion(int nums[],int si,int ei){
        int pivot=nums[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
            }
        }
        i++;
        int temp=nums[ei];
        nums[ei]=nums[i];
        nums[i]=temp;
        return i;
    }
}