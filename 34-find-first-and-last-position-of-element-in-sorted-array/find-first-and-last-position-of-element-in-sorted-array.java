class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int result[] = new int[2];
        result[0]=-1;
        result[1]=-1;

        findrange(nums,target,i,result);
        return result;
    }
    public static void findrange(int n[],int target,int index,int[] result){
        if(index==n.length){
            return ;
        }
        if(n[index]==target){
            if(result[0]==-1){
                result[0]=index;
            }
            result[1]=index;
        }
        findrange(n,target,index+1,result);
    }
}