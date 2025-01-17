class Solution {
    public void sortColors(int[] nums) {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
       }

       int count[] = new int[max+1];
       for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
       }

       int j=0;
       for(int i=0;i<count.length;i++){
        while(count[i]>0){
            nums[j]=i;
            j++;
            count[i]--;
        }
       }

    }
}