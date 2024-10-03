class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0]=-1;
        result[1]=-1;

        findrange(nums,target,0,result);
        return result;
    }
    public static void findrange(int num[],int target,int index,int result[]){
        if(index==num.length){
            return ;
        }
        if(num[index]==target){
            if(result[0]==-1){
               result[0]=index;
            }
            result[1]=index;
        }
        findrange(num,target,index+1,result);
    }
}