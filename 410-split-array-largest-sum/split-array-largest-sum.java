class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int si=0,ei=sum,ans=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(isValid(nums,n,k,mid)){
                ans=mid;
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }

    public static boolean isValid(int arr[],int n,int k,int mid){
        int stu=1,pages=0;
        for(int i=0;i<n;i++){
            if(arr[i]>mid){
            return false;
        }
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }else{
                stu++;
                pages=arr[i];
                if(stu>k){
                    return false;
                }
            }
        }
        return true;
    }
}