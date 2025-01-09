class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
             int freq=0;
             for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
                }
                 if(freq>(nums.length)/3){
                    if(n.contains(nums[i])){

                    }else{
                        n.add(nums[i]);
                    }
             }
        }
        return n;
    }
}